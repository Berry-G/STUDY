page_no = 1
page_url = f"https://finance.naver.com/sise/sise_index_day.naver?code=KOSPI&page={page_no}"

print(page_url)

import requests

import bs4

source = bs4.BeautifulSoup(requests.get(page_url).text)
# print(source)


dates = source.find_all("td", class_='date')
print(dates)
print(dates[0])
print(dates[0].text)

#
# 날짜 크롤링
date_list = []
for date in dates:
    date_list.append(date.text)

# 채결가 추출
prices = source.find_all("td", class_='number_1')
print(prices[::4])
price_list = []
for price in prices[::4]:
    price_list.append(price.text)
# print(price_list)

print(len(date_list))
print(len(price_list))