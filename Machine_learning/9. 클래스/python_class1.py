"""
    1. 클래스는 딥러닝 프로그램을 작성할 떄 자주 사용 됨.
    2.
        1) self
            - 인스턴스(instance) 자기 자신을 의미함.
        2) init() 함수
            - 생성자
            - self.age : 현재 인스턴스와 age 변수
"""


class Human:
    def __init__(self, name, age):
        self.name = name
        self.age = age

    def show_human(self):
        print("======사람 정보======")
        print(f"이름: {self.name}")
        print(f"나이: {self.age}")
        print()


class Teacher(Human):
    def __init__(self, name, age, gender, subject, payment):
        super().__init__(name, age)
        self.gender = gender
        self.subject = subject
        self.payment = payment

    def show_teacher(self):
        print("======교사 정보======")
        print(f"성별: {self.gender}")
        print(f"학과: {self.subject}")
        print(f"월급: {self.payment}")
        print()


# 이름 나이 성별 과목 월급
teacher = Teacher("이순신", 40, 1, "컴퓨터", 300)
teacher.show_human()
teacher.show_teacher()


class Student(Human):
    def __init__(self, name, age, student_id, grade, score):
        super().__init__(name, age)
        self.student_id = student_id
        self.grade = grade
        self.score = score

    def show_student(self):
        print("======학생 정보======")
        print(f"학생 번호 : {self.student_id}")
        print(f"학년 : {self.grade}")
        print(f"점수 : {self.score}")


student = Student("신사임당", 18, 1, 2, 95)
student.show_human()
student.show_student()
