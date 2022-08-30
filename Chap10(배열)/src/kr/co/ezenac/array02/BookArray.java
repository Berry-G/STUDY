package kr.co.ezenac.array02;

public class BookArray
{
	public static void main(String[] args)
	{
		Book[] book = new Book[5];
		
		book[0] = new Book("컴퓨터", "강민철");
		book[1] = new Book("컴퓨터2", "강민철");
		book[2] = new Book("컴퓨터3", "강민철");
		book[3] = new Book("컴퓨터4", "강민철");
		book[4] = new Book("컴퓨터5", "강민철");
		
		for(int i = 0; i<book.length; i++)
		{
			System.out.println(book[i].toString());
			book[i].showInfo();
		}
	}
}
