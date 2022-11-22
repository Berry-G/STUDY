# 비만도 계산기 만들어 보시오
"""
예시)
    BMI 계산기 입니다.
    신장: (입력)
    몸무게: (입력)
    BMI:
"""

height = int(input("신장 : "))
weight = int(input("몸무게 : "))
BMI = weight / (height**2) * 10000
print("BMI : ", BMI)

if BMI < 18.5 :
    resultText = "저체중"
elif BMI < 23 :
    resultText = "정상"
elif BMI < 25 :
    resultText = "과체중"
else :
    resultText = "비만"
print(resultText, "입니다.")