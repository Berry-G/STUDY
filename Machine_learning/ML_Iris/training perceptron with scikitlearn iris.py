"""
    * 머신러닝 분야의 고전적인 데이터셋인 붓꽃(Iris)
        1) Setosa, Versicolor, Virginica 세 종류(품종) => (레이블) 백터 y에 할당
"""
from sklearn import datasets
import numpy as np

iris = datasets.load_iris()
print(iris)

