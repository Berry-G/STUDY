import torch

a = torch.tensor([
    [1.0, 2.0, 3.0, 4.0],
    [5.0, 6.0, 7.0, 8.0]
])

print(a)
print(a.dtype)
print(a.mean())  # 전체 원소에 대한 평균
print(a.mean(dim=0))  # 각 열에 대하여 평균
print(a.mean(dim=1))  # 각 행에 대하여 평균

print("-------------------------------------")
print(a)
print(a.sum())  # 전체 원소에 대한 합계
print(a.sum(dim=0))  # 각 열에 대하여 합계
print(a.sum(dim=1))  # 각 행에 대하여 합계

# 네번재 축에 차원 추가
a = a.unsqueeze(2)
print(a)
print(a.shape)

# 크기가 1인 차원 제거
a = a.squeeze()
print(a)
print(a.shape)