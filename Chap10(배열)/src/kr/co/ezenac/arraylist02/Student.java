package kr.co.ezenac.arraylist02;

import java.util.ArrayList;

public class Student
{
	private String studentName;
	ArrayList<Book> bookList;
	
	public Student(String studentName)
	{
		//super();
		this.studentName = studentName;
		bookList = new ArrayList<>();
	}
	
	public void addBook(String title)
	{
		Book book = new Book();
		
		book.setBookName(title);
		bookList.add(book);
	}
	
	public void showInfo()
	{
		System.out.print(this.studentName + " 학생이 읽은 책은 " );
		int count=0;
		for(Book book : bookList)
		{
			count++;
			if(bookList.size() == count)
				System.out.print(book.getBookName());
		else
			System.out.print(book.getBookName() + ", ");
		}
		System.out.println("입니다.");
	}
	
	
}
