"""
    파일 입출력
        1) 파일을 읽어 다른 파일에 기록하기
            - 파일_ 객체 = open(file, mode)
        2) read()
            readLine() : 파일 내에서 1줄을 읽어옴
            readLines() : 파일의 모든 내용을 읽어옴
"""

print('파일을 읽기 모드로 오픈한다')
myfile01 = open('ezen.txt', 'rt', encoding='UTF-8')
linelists = myfile01.readlines()
myfile01.close()


total = 0
for one in linelists:
    score =  int(one)
    total += score

average = total / len(linelists)

print('파일을 쓰기 모드로 오픈한다')
myfile02 = open('result.txt', 'rw', encoding='UTF-8')
