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
