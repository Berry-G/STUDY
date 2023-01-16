import os
import tensorflow as tf

os.environ['TF_CPP_MIN_LOG_LEVEL'] = '3'

from tensorflow.python.client import device_lib

x = device_lib.list_local_devices()

""" colab에서 실행 결과
[name: "/device:CPU:0"
 device_type: "CPU"
 memory_limit: 268435456
 locality {
 }
 incarnation: 14961644926730048766
 xla_global_id: -1]
"""

data = [
    [1, 2],
    [3, 4]
]

x = tf.constant(data)
print(x)
print(tf.rank(x))  # 차원 출력 (axis 개수)
print("-------------------------------------------------------")

data = tf.constant("ezen string")
print(data)
print("-------------------------------------------------------")

a = tf.constant([5])
b = tf.constant([7])
print(a)
print(b)
print("-------------------------------------------------------")

c = (a + b).numpy()
print(c)
print(type(c))

result = c * 10
tensor = tf.convert_to_tensor(result)
print(tensor)
print(type(tensor))
print("-------------------------------------------------------")

x = tf.constant([
    [5, 7],
    [1, 2]
])

# x와 같은 모양과 자료형을 가지지만, 값이 1인 텐서 생성
x_ones = tf.ones_like(x)
print(x_ones)

# x와 같은 모양을 가지되, 자료형은 float으로 덮어쓰고, 값은 랜덤으로 채우기
x_rand = tf.random.uniform(shape=x.shape, dtype=tf.float32)
print(x_rand)
