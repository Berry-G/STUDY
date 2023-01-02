x = 10
learning_rate = 0.2
max_iterations = 100

# 손실함수 정의
loss_func = lambda x: (x - 3) ** 2 + 10

# 그래디언트(기울기) 정의 (손실함수의 1차 미분값)
gradient = lambda x: 2 * x - 6

# 경사하강법
for i in range(max_iterations):
    x = x - learning_rate * gradient(x)
    print("손실함수값(", x, ") =", loss_func(x))

print("최솟값 =", x)
