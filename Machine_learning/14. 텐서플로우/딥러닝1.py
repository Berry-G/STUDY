"""
    * AI (Artificial Intelligence) : Mimic Human Intelligence
        - Machine Learning : Data-driven Approach
            - 주어진 데이터나 과거 용례를 통하여 문제에 대한 해결 능력을 최대화 하는 것
                - 현실의 자료를 반영
            - "통계학"은 큰 역할 (샘플에서 추론)
                - 데이터를 연구하는 학문
                - 현실을 수학적으로 분석
                - 규칙성을 발견, 객관적 의사결정
            - Deep Learning : Deep Neural Networks
                - 인공지능이라는 거대한 학문의 일부
                - ML의 여러 기법 중 하나


"""

import numpy as np
# 사이킷런을 코드에 가져오기 위해서 sklearn이라는 이름으로 가져와야 함
# 선형 회귀를 구현하기 위해서 linear_model import
from sklearn import linear_model

# LinearRegression() 생성자를 통해 선형 회귀 모델()을 생성함
regr = linear_model.LinearRegression()

# 데이터 집합 X
X = [[163], [179], [166], [169], [171]]  # 입력 데이터(2차원 리스트)
y = [54, 63, 57, 56, 58]  # 정답
regr.fit(X, y)  # 학습

# 직선의 기울기
coef = regr.coef_  # regr 모델의 coef_의 속성값(기울기)을 얻음

# 직선의 절편
intercept = regr.intercept_  # regr 모델의 intercept 속성값으로 얻음

score = regr.score(X, y)  # Score() 함수를 통해서 이 모델의 점수 구함

# 출력
print("y = {} * x + {:.2f}".format(coef.round(2), intercept))
print("데이터와 선형 회귀 직선의 관계 점수 : {:1%}".format(score))

import matplotlib.pyplot as plt

fig = plt.figure(figsize=(8, 8))

# 학습 데이터와 y값을 산포도로 그리기
plt.scatter(X, y, color='blue', marker='D')
y_pred = regr.predict(X)  # 학습 데이터를 입력하여 예측값을 계산함
plt.plot(X, y_pred, 'r:')  # 계산된 기울기와 y절편을 가지는 점선 그리기
fig.savefig("LinearRegression_result.png")

# 167인 순신이의 키를 넣어서 그 추정값을 출력하기
sunsin = [[167]]
result = regr.predict(sunsin)
print('순신이의 키가 {}cm 이므로 몸무게는 {}kg으로 추정됨.'.format(
    sunsin, result.round(1)))
