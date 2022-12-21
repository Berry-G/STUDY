"""
    * 정규 표현식
        - 문자열 패턴

            문자열1 ab123
            문자열2 cd456
            문자열3 ef718
            문자열4 abc12
"""

import re

mylist = ['ab123', 'cd456', 'ef718', 'abc12']

# 정규 표현식 작성
regex = '[a-z]{2}\d{3}'

pattern = re.compile(regex)

print('# 문자 2개로 시작하고, 숫자 3개로 끝나는 항목')
matchList = []

for item in mylist:
    if pattern.match(item):
        print(item, '은 조건에 적합')
        matchList.append(item)
    else:
        print(item, '은 조건의 부적합')

print('적합한 항목들 ')
print(matchList)
