"""
    1. 클래스
        * 속성
            - 체력
            - 공격력
            - 방어력
            - 이동속도
        * 메서드
            - 위치로 이동하기
            - 공격하기
            - 아이템 사용하기
            - 귀환하기
    2. 클래스 만들기
        class 클래스 이름 :
            def 메서드 이름():
                명령 블록
    3. 클래스 사용하기
        인스턴스 = 클래스 이름(self)
        인스턴스.함수()
"""


class Champion:
    def __init__(self, name, health, attack):
        self.name = name
        self.health = health
        self.attack = attack
        print(f"{name}님 소환사의 협곡에 오신 것을 환영합니다.")

    def basic_attack(self):
        print(f"{self.name} 기본공격 {self.attack}")


Ezreal = Champion("이즈리얼", 600, 60)
Gwen = Champion("그웬", 620, 63)
Yasuo = Champion("야스오", 590, 60)

Ezreal.basic_attack()
Gwen.basic_attack()
Yasuo.basic_attack()
