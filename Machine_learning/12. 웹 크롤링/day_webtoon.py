from urllib.request import urlopen
from bs4 import BeautifulSoup

myUrl = 'https://comic.naver.com/webtoon/weekday'

# 페이지에서 데이터를 가져옴
response = urlopen(myUrl)
print(type(response))

# BeautifulSoup() 사용해서 데이터를 파싱
soup = BeautifulSoup(response, 'html.parser')

# print(soup.prettify())

title = soup.find("title").string
print(title)

