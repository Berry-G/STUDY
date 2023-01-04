"""
    1. 텐서플로 일반적인 아키텍쳐
        1) 준비된 데이터를 사용하여 모델(모형)을 생성
            - 데이터 준비, 모델 정의, 모델 훈련, 모델 평가
        2) 생성된 모델을 사용하여 분류 및 예측
        3) 사용자에게 웹이나 모바일로 서비스를 배포, 환경도 제공

    2. 텐서플로 2.x
        1) 기존 1.x 버전의 불편했던 문법을 개선, tf.keros를 중심으로 high level API를 제공
        2) 텐서플로에서 딥러닝을 구현하는 순차적 방법으로 적용하면 됨

    3. 데이터 준비
        1) 데이터가 텍스트일 경우 (텍스트 모델을 사용해야 할 경우)
            - 서로 다른 길이의 시퀀스(sequence)를 분할하여 처리

"""

import os
import pandas as pd

os.environ['TF_CPP_MIN_LOG_LEVEL'] = '3'

# 파일을 실행
filename = os.listdir("ezen")[0]
file = open("ezen/" + filename, encoding="utf-8")

cols = ['price', 'maint', 'doors', 'persons', 'capacity', 'safety', 'output']
cars = pd.read_csv(file, names=cols, header=None)

print(cars)
print("------------------------------------------------------------------------")

price = pd.get_dummies(cars.price, prefix='price')
maint = pd.get_dummies(cars.maint, prefix='maint')
doors = pd.get_dummies(cars.doors, prefix='doors')
persons = pd.get_dummies(cars.persons, prefix='persons')
capacity = pd.get_dummies(cars.capacity, prefix='capacity')
safety = pd.get_dummies(cars.safety, prefix='safety')
labels = pd.get_dummies(cars.output, prefix='output')

# 원 - 핫 인코딩이 적용된 데이터 셋
X =

"""
    모델 정의
        1) Sequential API
            - 다차원 입출력을 갖는 신경망 구현
            - 텐서플로 2에서 케라스를 이용
            - 케라스는 텐서플로 런타임을 이용하여 동작
"""
from sklearn.model_selection import train_test_split

X_train, X_test, y_train, y_test, = train_test_split(X, y, test_size=0.20, random_state=42)

# 케라스 사용해서 모델 정의
from tensorflow.keras.layer

model = Model(inputs=input_layer, outputs = output)

# 모델 완전연결층은 총 3개로 구성되어 있음.
model.summary()

# 모델 훈련
history = model.fit(X_train, y_train, batch_size = 8, epochs = 50, verbose = 1, validation_split = 0.2)

# 모델 평가
score = model.evalute(X_test, y_test, verbose = 1)
print("Test score : ", score[0])
print("Test Accuracy : ", score[1])