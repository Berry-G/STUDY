package kr.co.ezenac.array04;

import java.util.concurrent.CopyOnWriteArrayList;

import kr.co.ezenac.array02.Book;

public class ObjectCopy
{
	public static void main(String[] args)
	{
		Book[] libray = new Book[5];
		Book[] copyLibray = new Book[5];


		libray[0] = new Book("컴퓨터", "강민철");
		libray[1] = new Book("컴퓨터2", "강민철");
		libray[2] = new Book("컴퓨터3", "강민철");
		libray[3] = new Book("컴퓨터4", "강민철");
		libray[4] = new Book("컴퓨터5", "강민철");
				
		System.arraycopy(libray, 0, copyLibray, 0, 5); //얕은 복사를 지원
		
		for (Book book : copyLibray)	
			book.showInfo();
	}
	

}
