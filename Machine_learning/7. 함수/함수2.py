"""
    리스트 내 원소 중에서 가장 큰 값의 인덱스(위치)를 찾아서 반환하는 함수를 작성하시오.

    data = [7, 1, 5, 9, 3, 2, 4]
"""

data = [7, 1, 5, 9, 3, 2, 4]


def max_index(data_list):
    print(data_list.index(max(data_list)))


max_index(data)

"""
    특정한 값을 가지는 원소의 인덱스를 찾는 함수를 작성해 보시오.
    
    [3,5,7,9], 2    ==> -1 (찾지 못한 경우 -1 반환)
    [3,5,7,9], 7    ==> 2
    
    enumerate()
"""

print("\n리스트에서 인덱스 찾기")
data = [3, 5, 7, 9]


# case 1
def find_index(data_list, value):
    try:
        print(data_list.index(value))
    except:
        print(-1)


find_index(data, 7)
find_index(data, 4)


# case 2
def find_specific_value(lis, value):
    for i, x in enumerate(lis):
        if x == value:
            return i
    return -1


print("\n case 2")
print(find_specific_value(data, 2))
print(find_specific_value(data, 9))
print(find_specific_value([23, 15, 26, 19], 19))

"""
    하나의 자연수가 주어졌을 때, 소수인지 아닌지 판별하는 함수를 작성하시오.
"""


def prime_number(num):
    count = 0
    for i in range(1, num+1):
        if num % i == 0:
            count = count + 1
            if count > 2:
                break
    if count == 2:
        print(num, '은 소수입니다.', count)
    else:
        print(num, '은 소수가 아닙니다.', count)


print("소수 찾기")
prime_number(8)
