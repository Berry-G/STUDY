def func_ezen(arg_1, arg_2, *args, **kwargs):
    print(arg_1, arg_2, args, kwargs)


print()
func_ezen(10, 20, 'snow', 'snow2', 'snow3')
print()
func_ezen(10, 20, 'snow1', 'snow2', 'snow3', age1=30, age2=31, age3=30)


# 함수 6 - 중첩 함수
def nested_func(num):
    def func_in_func(num2):
        print(num2)
        num2 = num2 - 50

    print("In func")
    func_in_func(num + 100)


# func_in_func(1)
nested_func(1)


# 함수 7 - hint
def tot_length(word: str, num: int) -> int:
    return len(word) * num


num1 = 10
print("hint func :", type(tot_length("Heavy snow falls in Seoul", num1)), tot_length("Heavy snow falls in Seoul", num1))
# tot_length()

"""
    **kwargs : 함수를 호출할 때 키워드 아규먼트의 갯수를 특정지을 수 없을 때 사용
               불특정한 다수의 숫자들은 'kwargs'라는 딕셔너리에 추가됨.
"""


def plus_unlimited(*args, **kwargs):
    print(type(kwargs), kwargs)
    sum(kwargs.values())
    sum(kwargs.values())
    sum(args)
    print(sum(args) + sum(kwargs.values()))


plus_unlimited(1, 2, 3, 4, num1=100, num2=300, num3=20, num4=7)

# list를 함수의 파라미터로 넣어 실행하는 경우
list_numbers = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
plus_unlimited(*list_numbers)

# 딕셔너리를 함수의 파라미터로 넣어 실행하는 경우
dict_heights = {'ezen_height': 178, 'ezenyoung_height': 100, 'sugejzen_height': 170}
plus_unlimited(**dict_heights)

help(plus_unlimited)
help(print)
help(input)

"""
    * Lambda 함수
        - 단일문으로 표현되는 익명함수
            - 익명함수란 이름이 없는 구현체만 존재하는 간단한 함수를 의미
        - 코드 상에서 한번만 사용되는 기능이 있을 때,
          굳이 함수로 만들지 않고 1회성으로 만들어서 쓸 때 사용
        
        - lambda가 유용하게 사용되는 대표적 함수 3가지
            - 함수형 프로그래밍의 기본 요소이기도 함
            - filter() : 틎겅 조건을 만족하는 요소만 남겨두고 필터링
            - map(): 각 원소르 주어진 수식에 따라 변형하여 새로운 리스트를 반환
            - reduce() : 앞 2개의 원소를 가지고 연산.
                         연산의 결과가 또 다음 연산의 입력으로 진행됨.
                         따라서 마지막까지 진행되면 최종 출력은 1개의 값만 남게 됨.1`
"""

square = lambda x: x ** 2
print(square(5))

# pythagoras_lambda = lambda num1, num2: (num1*, num2*)
# print(pythagoras_lamb)

"""
    키가 180cm 이상인 사람들의 경우 "키가 정말 큽니다." 라는 메시지가 출력되고
    그렇지 않은 사람들의 경우 "계속 키가 클 겁니다." 라는 메시지가 출력되는 함수를 작성하시오
    height_high(181)
    height_high(178)
"""


def height_high(height):
    return '키가 정말 큽니다.' if height >= 180 else '계속 키가 클 겁니다.'


result = height_high(181)
print(result)
