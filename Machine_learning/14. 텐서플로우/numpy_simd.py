"""
    1. 파이썬 리스트 & 넘파이
        1) 넘파이 배열
            - 형상 (shape) : 차원의 크길르 지정하는 정수의 튜플
            - 축 (axis) : 차원
                - axis = 1 (칼럼)
                - axis = 0 (행)

            - shape : (3, )     <== 1d 배열
                - 2 3 4
                    axis = 0 (행)
            - shape : (2, 3)    <== 2d 배열
                - 2 3 4
                  6 7 8
                    axis = 0 (행)
                    axis = 1 (컬럼)
            - shape : (4, 3, 2) <== 3d 배열
                - 2 3 4
                  6 7 8
                  2 3 4
                  6 7 8
                          2 3 4
                          6 7 8
                          2 3 4
                          6 7 8

                    axis = 0
                    axis = 1
                    axis = 2
        2) 넘파이의 핵심은 다차원 배열
        3) 리스트와 넘파이의 가장 큰 차이는 계산 성능임
            - 넘파이는 대용랑의 배열, 행렬 연산 함수를 포함, 성능 우수
"""

import numpy as np

arr1 = np.array([[1,2,3], [4,5,6], [7,8,9]])
arr2 = np.array([[2,3], [2,2], [1,3]])
print()
# result = arr @ arr2
result = arr1.dot(arr1, arr2)
print(result)