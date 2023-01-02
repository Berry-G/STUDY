"""
    Author : Ezen
    Date : 2022. 12. 29
"""

"""
    keras : tensorflow를 활용해서 인공지능을 더 쉽고 유연하게 만들 수 있도록 도와주는 라이브러리
"""
from tensorflow import keras
import data_reader

# 전체 데이터셋을 몇 회 학습시킬 것인지
EPOCHS = 20

dr = data_reader.DataReader()

# 인공신경망 제작
model = keras.Sequential([
    keras.layers.Dense(3),                          # 첫 번째 층은 3개의 유닛을 가지고 있으며 한 레이어 구성
    keras.layers.Dense(128, activation="relu"),     # 두 번째 층은 128개의 유닛을 가지고 한 레이어 구성, 렐루 함수
    keras.layers.Dense(3, activation="softmax")     # 세 번째 층은 3개의 유닛을 가지고 한 레이어 구성, 소프트맥스 함수
])

# 인공신경망 컴파일
'''
    model 변수에 저장한 인공신경망을 합축하고
    메모리 위에 올려서 당장 사용할수 있게 함.
    optimizer : 신경망을 학습시키기 위해 사용하는 알고리즘
    metrics : 어떤 점수를 기준으로 인공지능의 성능을 채점할 것인지 기준
    loss : 인공지능의 학습 방향을 결정하는 함수
'''

model.compile(optimizer="adam", metrics=["accuracy"], loss="sparse_categorical_crossentropy")

# 인공신경망 학습
