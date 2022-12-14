"""
    1) 숫자형
    2) 문자형
    3) 리스트
        - 집합 구조
        - 데이터를 모아놓은 데이터 타입
        - 리스트 인덱싱
        - 리스트 값 변경
        - 리스트 자르기
        - 리스트 요소 추가, 제거, 정렬, reverse
        - 중첩 리스트
"""

list_ = []
print(list_, type(list_))

student = ['Susan', 'Jessica', 'John', 'Michael']
age = [19, 15, 16, 17]
print(student)
print(age)

# 인덱싱
print("인덱싱 :", student[1], age[1])
print("인덱싱 :", student[-1], age[-1])

# 리스트 값 변경
student[1] = 'Jennie'
age[1] = 18
print("값 변경 :", student)
print("값 변경 :", age)

# 슬라이싱
print("슬라이싱 :", student[1:2])
print("슬라이싱 :", student[1:3])

# 리버스
student.reverse()
print("리버스 :", student)

# 값 추가
student.append('mango')
print("값 추가 :", student)

# 값 제거
student.remove('mango')
print("값 제거 :", student)

# 정렬
age.sort()
print("값 정렬 :", age)
age.sort(reverse=True)
print("값 정렬 :", age)

# 삽입
age.insert(0, 2)
print("삽입 :", age)

# POP
age.pop(0)
print("POP :", age)
print()

# 중첩 리스트
stu_list = [student, age]
print("stu_list :", stu_list)

print(stu_list[0])
print(stu_list[1][0])

