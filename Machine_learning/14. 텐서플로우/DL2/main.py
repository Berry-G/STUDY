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
import numpy as np  # 벡터 및 행렬 연산에서 매우 편리한 기능 제공하는 파이썬 라이브러리 패키지
import tensorflow as tf
import pandas as pd  # 데이터 분석을 위해 사용되는 파이썬 라이브러리 패키지
import matplotlib.pyplot as plt
import seaborn as sns

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

# 원-핫 인코딩이 적용된 데이터셋
X = pd.concat([price, maint, doors, persons, capacity, safety], axis=1)
y = labels.values

"""
    모델 정의
        1) Sequential API
            - 다차원 입출력을 갖는 신경망 구현
            - 텐서플로 2에서 케라스를 이용
            - 케라스는 텐서플로 런타임을 이용하여 동작
"""
from sklearn.model_selection import train_test_split

X_train, X_test, y_train, y_test, = train_test_split(X, y, test_size=0.20, random_state=42)

from tensorflow.keras.layers import Input, Dense, Activation, Dropout
from tensorflow.keras.models import Model

# 케라스 사용해서 모델 정의
# Sequential API 사용
# 입력(x) ==>  계층 (Layer1), 계층 (Layer2), 계층 (Layer3) ==> 출력(y)
input_layer = Input(shape=(X.shape[1],))
dense_layer_1 = Dense(15, activation='relu')(input_layer)
dense_layer_2 = Dense(10, activation='relu')(dense_layer_1)
output = Dense(y.shape[1], activation='softmax')(dense_layer_2)

model = Model(inputs=input_layer, outputs=output)
# categorical_crossentropy의 출력 값은 원-핫 인코딩된 결과가 출력됨
model.compile(loss='categorical_crossentropy', optimizer='adam', metrics=['acc'])

# 모델 완전연결층은 총 3개로 구성되어 있음.
model.summary()

# 모델 훈련
history = model.fit(X_train, y_train, batch_size=8, epochs=50, verbose=1, validation_split=0.2)

# 모델 평가
# 테스트 정확도(test accuracy)의 결과값이 0.96으로, 정확도는 약 97%
# 정확도가 높기 때문에 학습이 잘되었다고 할수있음.
score = model.evaluate(X_test, y_test, verbose=1)
print("Test score : ", score[0])
print("Test Accuracy : ", score[1])
