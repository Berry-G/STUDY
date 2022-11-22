"""
    홀수 짝수 구하기
    - % 연산자
"""

int1, int2, int3, int4 = 1, 2, 3, 4
div =2

rem1, rem2, rem3, rem4 = int1%div, int2%div, int3%div, int4%div
#print(rem1, rem2, rem3, rem4)

# 아 배열 쓰고 싶다 아 메서드 쓰고 싶다
if rem1 == 0 : print("rem1 : 짝수")
else : print("rem1 : 홀수")
if rem2 == 0 : print("rem2 : 짝수")
else : print("rem2 : 홀수")
if rem3 == 0 : print("rem3 : 짝수")
else : print("rem3 : 홀수")
if rem4 == 0 : print("rem4 : 짝수")
else : print("rem4 : 홀수")
