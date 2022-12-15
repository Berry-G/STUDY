"""
    6) Dataframe
        - index 행
        - columns 열
        - 데이터 선택(slicing)
            - 데이터 위치를 활용한 데이터 가공 : loc(), iloc()
        - 데이터 삭제(drop)
            - 필요없는 데이터 삭제
            - 행, 열 단위로 삭제
        - 중복 데이터 삭제 (duplicated(), drop_duplicates())
"""

import pandas as pd

df = pd.DataFrame()
print(type(df))

stu_list = [[
    'Susan', 'Jack', 'Mitch', 'William'
], [19, 15, 16, 17]]

df = pd.DataFrame(stu_list)
print(df)

df = df.T
print(df)

print()

columns_name = ['name', 'age']
df.columns = columns_name
print(df)

"""
    "I am quitting this exam."
    "This is the quickest approach I ever seen"
    "The king should make quick decision"
    
    문장을 입력하다가 'q'라고 작성을 하였습니다.
    원래는 'w'를 작성해야했습니다.
    
    주어진 문장들을 모두 맞게 변경하시오. (replace())
    
    "I am wuitting this exam."
    "This is the wuickest approach I ever seen"
    "The king should make wuick decision"
"""

# 리스트
sentences = ["I am wuitting this exam.", "This is the wuickest approach I ever seen",
             "The king should make wuick decision"]
for sentence in sentences:
    print(sentence.replace("w", "q"))
print()

# 주어진 문장들에 대해서 몇 개의 단어가 있는 지 출력하시오. (split())
# 5
# 8
# 6
for sentence in sentences:
    print(len(sentence.split()))

"""
    차범근 축구감독이 미래 축구 꿈나무를 선발하여 축구부를 만듭니다.
    키가 175cm 이상인 사람들을 뽑아서 축구부를 결성합니다.
    soccer_team이라는 빈 리스트를 작성하여, 축구부가 될 사람들의 이름만 추가하는 코드를 작성해 보시오.
"""

candidates = {"이순신": 146, "이도": 160, "유성룡": 167, "정철": 175.3, "이황": 207}
soccer_team = []
for name, height in candidates.items():
    if height >= 175:
        soccer_team.append(name)
print(soccer_team)

soccer_team2 = [name for name, height in candidates.items() if height >= 175]
print(soccer_team2)


print()
# 구구단 출력 (for 문)
for num2 in range(1, 10):
    for num1 in range(2, 10):
        print("{} x {} = {}".format(num1, num2, num1*num2),end= "\t")
    print()

print()
# 구구단 가로 출력 (while 문)
n = 2
while n < 10:
    m = 1
    while m < 10:
        print("{} x {} = {}".format(n, m, n*m),end= "\t")
        m += 1
    print()
    n += 1

print()
'''
    얼마나 시간이 걸리고 개수가 몇개인지 확인하시오.
    - for 문을 이용하여 1부터 1000000까지의 숫자중에서 3의 배수인 숫자들을 찾고,
    몇개가 있는지 알아보자.
    - 이 코드를 수행하는데 걸린 시간을 확인해보자.
'''
import time
start = time.time()

ls = []
for a in range(1, 1000001):
    if a % 3 == 0:
        ls.append(a)

end = time.time()
print(f"소요시간 : {end - start}")
print(f"개수 : {len(ls)}개")

print()
# 앞서 구구단은 얼마나 시간이 걸릴까요?
start = time.time()
# 구구단 출력 (for 문)
for num2 in range(1, 10):
    for num1 in range(2, 10):
        print("{} x {} = {}".format(num1, num2, num1*num2),end= "\t")
    print()
end = time.time()
print(f"소요시간 : {end - start}")

print()
'''
    도준이가 5000원 이상 소지하고 있을 경우 택시를 타고 집에 귀가할수 있지만,
    걸어서 귀가할 수도 있습니다.
    택시를 탈 경우, 3000원이 소비됩니다. 잔액을 표시하시오.

    2000원 이상 있을 경우 버스를 타고 귀가할수 있습니다.
    버스를 탈 경우, 1000원이 소비됩니다. 잔액을 표시하시오.

    2000원 미만일 경우 걸어서 귀가할수 있습니다.
    위 조건을 반영하는 코드를 작성하시오.
'''
money = 10000
taxi  = True

if money >= 5000:
    if taxi:
        money -= 3000
        print(f"택시를 탑니다, 잔액은 : {money}원")
    else:
        print(f"걸어서 귀가, 잔액은 : {money}원")
elif money >= 2000:
    money -= 1000
    print(f"버스를 탑니다, 잔액은 : {money}원")
else:
    print("걸어서 귀가")

print()
'''
    도진이가 택시에 내려서 걸어서 귀가하던 중
    집 근처 오락실에서 '철권'게임을 하고 싶어졌습니다.
    회당 500원인 이 게임을 몇번이나 할수 있을까요?
    매번 게임을 진행한 뒤 도준이가 가지고 있는 잔액과 몇 번 게임을 했는지 횟수를 출력하는 코드를 작성하시오.

    현재까지의 게임한 횟수는 :
    현재 잔액 :

    최종 게임 횟수 :
    최종 잔액 :
'''
# money = 7000
counts = 0
while money >= 500:
    counts += 1
    money -= 500
    print(f"현재까지의 게임한 횟수는 : {counts}회")
    print(f"현재 잔액 : {money}원")

print(f"최종 게임 횟수 : {counts}회")
print(f"최종 잔액 : {money}원")


