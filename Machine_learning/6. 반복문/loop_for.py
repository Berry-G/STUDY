"""
    for 변수 in 시퀀스 자료:
        명령문

    예) for a in [1,2,3,4]
        print(a)

    * 순서가 있는 자료형
    - 리스트, 문자열, range 객체, 튜플, 딕셔너리

    * range(10) : 0~9까지 숫자를 포함하는 range 객체를 생성해 줌.
"""

# 리스트 사용
챔피언 = ["티모", "이즈리얼", "나미"]

for 챔프 in 챔피언 :
    print("선택한 챔피언은", 챔프, "입니다.")

# 문자열 사용
메시지 = "나는 할수 있어! 다 할수 있어!"
for word in 메시지:
    print(word)

# range 객체 사용
print("range 객체 사용")
x = range(10)
for i in x:
    print(i)

# range(시작, 끝+1, 단계)
print("range(시작, 끝+1, 단계)")
for i in range(1, 10, 2):
    print(i)