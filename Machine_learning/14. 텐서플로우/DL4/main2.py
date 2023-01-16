import torch
from torch import nn
from torch.utils.data import DataLoader, Dataset
import matplotlib.pyplot as plt
import numpy as np
import pandas as pd

dataset = pd.read_csv('ezen/car_evaluation.csv')
print(dataset.head())

# 컬럼들의 목록
categorical_columns = ['price', 'maint', 'doors', 'persons', 'lug_capacity', 'safety']

# astype() 매서드를 이용하여 데이트를 범주형 단어로 변환
for category in categorical_columns:
    dataset[category] = dataset[category].astype('category')

# 범주형(단어)로 변환 => 넘파이 배열
price = dataset['price'].cat.codes.values
maint = dataset['maint'].cat.codes.values
doors = dataset['doors'].cat.codes.values
persons = dataset['persons'].cat.codes.values
lug_capacity = dataset['lug_capacity'].cat.codes.values
safety = dataset['safety'].cat.codes.values

# 두 개 이상의 넘파이 객체를 합침
category_data = np.stack([price, maint, doors, persons, lug_capacity, safety], 1)
print(category_data[:10])

print("-" * 30)

# 레이블(output) 로 사용할 칼럼도 텐서로 변환
# get_dummies() : 가변수(dummy variable)로 만들어주는 함수 (0, 1)
outputs = pd.get_dummies(dataset.output)
outputs = outputs.values
outputs = torch.tensor(outputs).flatten()

print(category_data.shape)
print(outputs.shape)

# 범주형 데이터와 레이블을 텐서로 변환함
"""
    컬럼의 고유 값을 2로 나누는 것을 많이 사용
    - 예를 들어 price 컬럼은 4개의 고유값을 갖기 때문에 4/2=2
"""
print("-" * 30)

categorical_columns_size = [len(dataset[column].cat.categories) for column in categorical_columns]
categorical_embedding_size = [(col_size, min(50, (col_size + 1) / 2)) for col_size in categorical_columns_size]
print(categorical_columns)
print("-" * 30)

total_records = 1728
test_records = int(total_records * .2)

categorical_train_data = category_data[:total_records - test_records]       # 88
categorical_test_data = category_data[total_records - test_records:total_records]       # 20
train_outputs = outputs[:total_records - test_records]
test_outputs = outputs[total_records - test_records:total_records]

print(len(categorical_train_data))
print(len(categorical_test_data))
print(len(train_outputs))
# print(len(test_outputs))
print()


# nn.ModuleList(ni, nf) for ni, nf in

class Model(nn.Module):
    """
        embedding_size
        output_size : 출력물의 크기
        layers :
    """

    def __init__(self, embedding_size, output_size, layers, p=0.4):
        super.__init__()
        self.all_embeddings = nn.ModuleList([nn.Embedding(ni, nf) for ni, nf in embedding_size])
        self.embedding_dropout = nn.Dropout(p)

        all_layers = []
        num_categorical_cols = sum((nf for ni, nf in embedding_size))
        input_size = num_categorical_cols

        for i in layers:
            all_layers.append(nn.Linear(input_size, i))
            all_layers.append(nn.ReLU(inplace=True))
            all_layers.append(nn.BatchNorm1d(i))
            all_layers.append(nn.Dropout(p))
            input_size = i

        all_layers.append(nn.Linear(layers[-1], output_size))
        self.layers = nn.Sequential(*all_layers)  # 순서대로 레이어를 적용

    def forward(self, x_categorical):
        embeddings = []
        for i, e in enumerate(self.all_embeddings):
            embeddings.append(e(x_categorical[:, i]))
        x = torch.cat(embeddings, 1)
        x = self.embedding_dropout(x)
        x = self.layers(x)
        return x


"""
    Model 클래스의 객체를 생성
    객체를 생성하면서 범주형 컬럼의 임베딩 크기, 출력 크기, 은닉층의 뉴런, 드롭아웃을 전달
    은닉층의 뉴런을 정의는 여러 크기로 지정하여 테스트 해 보는 것이 학습에 도움이 될 것임.
"""
model = Model(categorical_embedding_size, 4, [200, 100, 50], p=0.4)
print(model)

"""
    모델을 훈련시키기 전 손실 함수와 옵티마이저에 대해 정의
    이 DL4의 경우 데이터를 분류해야 하는 것으로 크로스 엔트로피(cross entropy) 손실함수를 사용함
    옵티마이저는 아담(Adam)을 이용함
    
    lr(Learning Rate) : 
"""
print("-" * 30)
loss_function = nn.CrossEntropyLoss()
optimizer = torch.optim.Adam(model.parameters(), lr=0.001)

"""
    파이토치는 GPU에 최적화된 딥러닝 프레임워크임.
    GPU가 있으면GPU를 사용하고, 없다면 CPU를 사용하도록 함.
"""
if torch.cuda.is_available():
    device = torch.device('cuda')
else:
    device = torch.device('cpu')

"""
    모델을 학습시킴
"""
epochs = 500
aggregated_loss = []

train_outputs = train_outputs.to(device=device, dtype=torch.int64)
for i in range(epochs):
    i += 1
    y_pred = model(categorical_train_data).to(device)   #예측값
    single_loss = loss_function(y_pred, loss_function(y_pred, train_outputs))
    aggregated_loss.append(single_loss)

    if i % 25 == 1:
        print(f'epoch: {i:3} loss: {single_loss.item():10.8f}')

    # single_
    optimizer.step()

"""
    학습을 했고 테스트 데이터셋으로 예측 진행하기
    categorical_test_data 데이터셋을 모델에 적용하기
"""
print("-" * 30)
test_outputs = test_outputs.to(device=device, dtype=torch.int64)
with torch.no_grad():
    y_val = model(categorical_test_data).to(device)
    loss = loss_function(y_val, test_outputs)
print(f'Loss : {loss:.8f}')

print("-" * 30)
"""
    정확도, 정밀도, 재현율 출력하기
"""

import warnings
warnings.filterwarnings('ignore')
from sklearn.metrics import classification_report, confusion_matrix, accuracy_score

y_val = np.argmax(y_val.cpu().numpy(), axis=1)
test_outputs = test_outputs.cpu().numpy()
print(confusion_matrix(test_outputs, y_val))        # 정밀도
print(classification_report(test_outputs, y_val))   # 정확도
print(accuracy_score(test_outputs, y_val))          # 재현율

# 신경망에서 필요한 모든 파라미터를 무작위로 선택했다는 감안할 때 74%의 정확도는 나쁘지 않음
# 파라미터(훈련/테스트 데이터 셋 분할, 은닉층 개수 및 크기 등) 변경하면서 더 나은 성능을 찾아보는 것도 의미가 있을 것임.
