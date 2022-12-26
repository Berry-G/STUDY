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
