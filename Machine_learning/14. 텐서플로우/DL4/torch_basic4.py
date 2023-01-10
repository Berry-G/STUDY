import torch
import numpy as np
from torch import nn
from torch.utils.data import DataLoader
from torchvision import datasets
from torchvision.transforms import ToTensor, Lambda, Compose

data = ([
    [1, 2],
    [3, 4]
])

# numpy array 로 부터 tensor 생성하기 -- copy본 생성
np_array = np.array(data)

x_np_1 = torch.as_tensor(np_array)
print(x_np_1)

x_np_2 = torch.as_tensor(np_array)
print(x_np_2)

x_np_3 = torch.as_tensor(np_array)
print(x_np_3)

x_np_1[0,0] = 5
print(x_np_1)
print(np_array)
print(x_np_2)
print(x_np_3)

c = torch.float32((2, 3), 2)
print(c)

d = torch.empty(2, 3)
print(d)
