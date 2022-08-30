package kr.co.ezenac.arraylist;

public class Book
{
	String title;
	String author;
	
	public Book()
	{
		
	}
	
	public Book(String x, String y)
	{
		this.title=x;
		this.author=y;
	}
	
	public String getTitle()
	{
		return title;
	}
	public void setTitle(String title)
	{
		this.title = title;
	}
	public String getAuthor()
	{
		return author;
	}
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void showInfo()
	{
		System.out.println(this.title + ", " + this.author);
	}

}
