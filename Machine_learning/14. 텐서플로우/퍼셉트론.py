"""
    3) 논리 연산을 하는 퍼셉트론
        x1      x2      y(X1 and X2)    y(X1 OR X2)
        0       0           0               0
        0       1           0               1
        1       0           0               1
        1       1           1               1

    4) AND / OR 연산
        - 각 표본의 입력에 대한 출력값을 X-Y 평면 표시
"""
import numpy as np
epsilon = 0.00000001
def perceptron (x1, x2):
    w1, w2, b = 1.0, 1.0, -1.5
    sum_ = w1 + w2