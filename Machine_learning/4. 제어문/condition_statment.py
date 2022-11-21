# 제어문 - 조건문, 반복문
# ex) 기존 비밀번호 = "0111"
#     입력한 비밀번호 = "0111"
#     만약 비밀번호를 정확히 입력했으면 ---> 로그인 성공
#     만약 입력을 안했으면 ---> 아무것도 입력하지 않았습니다!
#     만약 비밀번호가 일치하지 않으면 ---> 로그인 실패!
from builtins import print

origin_pw = "0111"
input_pw = input("패스워드를 입력하세요 >>> ")

if input_pw == origin_pw:
    #조건 A가 참인 경우
    print("로그인 성공!")
    print("환영합니다")
elif input_pw == "":
    print("아무것도 입력하지 않았습니다!")
else:
    print("로그인 실패!")
    print("비밀번호를 확인하세요.")