data = result.read()
print('type() : ', type(data))

# 파일로 저장하기
with open(savename, mode='wb') as f:
    f.write(data)
    print(savename + '파일로 저장되었습니다.')