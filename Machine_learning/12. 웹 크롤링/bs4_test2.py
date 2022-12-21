from bs4 import BeautifulSoup

myencoding = 'utf-8'
myparser = 'html.parser'
filename = 'cartoon.html'

html = open(filename, encoding = myencoding)
soup = BeautifulSoup(html, myparser)


# 객체.select(<선택자>) : css 선택자로 여러 요소를 리스트로 추출함
h1 = soup.select_one("div#cartoon > h1").string
print('h1= ', h1)
li_list = soup.select("div#cartoon > ul > li")
print('li = ', li_list)
li2 = soup.select('ul.elements > li ')
print('lil2 = ', li2)

for li in li_list:
    print("li = ", li.string)


choice = lambda x: print(soup.select_one(x).string)
print('\nchoice("#item5") :', end='')
choice("#item5")
print('\nchoice("#item4") :', end='')
choice("#item4")
print('\nchoice("ul#itemlist > li#item3") :', end='')
choice("ul#itemlist > li#item3")
print('\nchoice("ul > li#item2") :', end='')
choice("ul > li#item2")

print()
print('\nsoup.select("li")[1].string : ', end='')
print(soup.select("li")[3].string)

print('-' * 30)

