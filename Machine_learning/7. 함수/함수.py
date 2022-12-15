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
print("hint func :", type(tot_length("Heavy snow falls in Seoul", num1)) ,tot_length("Heavy snow falls in Seoul", num1))
tot_length()
