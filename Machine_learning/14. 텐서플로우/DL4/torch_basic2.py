import torch

a = torch.tensor([1,2,3])
b = torch.tensor([4,5,6])

c = (a+b).numpy()
print(c)
print(type(c))

print("----------------------")
result = c

tensor = torch.from_numpy(result)
print(tensor)
print(type(tensor))

# 다른 텐서의 정보를 토대로 텐서를 초기화할 수 있음
x = torch.tensor([
    [5, 7],
    [1, 2]
])

# x와 같은 모양과 자료형을 가지지만, 값이 1인 텐서 생성
x_ones = torch.ones_like(x)
print(x_ones)

# x와 같은 모양을 가지되, 자료형은 float으로 덮어쓰고, 값은 랜덤으로 채우기
x_rand = torch.rand_like(x, dtype=torch.float32)
print(x_rand)

print("--------------------------------")

# 텐서의 특정 차원 접근
tensor = torch.tensor([
    [1, 2, 3, 4],
    [5, 6, 7, 8],
    [9, 10, 11, 12]
])
print(tensor.shape)
print(tensor[0])        # first row
print(tensor[:, 0])     # first column
print(tensor[..., -1])     # last column

# 두 텐서를 이어 붙여 연결하여 새로운 텐서를 생성

# dim : 텐서를 이어 붙이기 위한 축
# 0번 축(행)
result = torch.cat([tensor, tensor, tensor], dim=0)
print(result)

# 1번 축(열)을 기준으로 이어 붙이기
result = torch.cat([tensor, tensor, tensor], dim=1)
print(result)

print("--------------------------------")

a = torch.tensor([2])
b = torch.tensor([5.0])
print(a)
print(a.dtype)
print(b)
print(b.dtype)
print(a + b)        # 텐서 a는 자동으로 float32형으로 형변환 처리
print(a + b.type(torch.int32))

c = a.clone().view(4,2)
print(c)
a[0] = 9
print(b)
print(c)