"""
    로또 예상 번호 추출 프로그램을 구현하려고 합니다.
    다음 조건에 따라 프로그램을 완성해 보시오.
        1) 로또 번호를 6개를 생성한다
        2) 로또 번호는 1~45까지의 랜덤한 번호다.
        3) 6개의 숫자 모두 달라야한다
        4) get_random_number() 함수를 사용해서 구현한다.

        출력 예) 1 8 11 13 26 42
"""
import random

def get_random_number():
    number = random.randint(1,45)
    return number

lotto = []
while len(lotto)<6:
    x = get_random_number()
    # 중복 체크
    if x not in lotto:
        lotto.append(x)

lotto.sort()
# print(lotto)

for num in lotto:
    print(num,end=" ")