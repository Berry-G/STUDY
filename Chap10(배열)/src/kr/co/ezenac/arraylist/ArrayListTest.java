package kr.co.ezenac.arraylist;

import java.util.ArrayList;

public class ArrayListTest
{
	public static void main(String[] args)
	{
		ArrayList<Book> libray = new ArrayList<>();

		libray.add(new Book("운영체제", "이순신"));
		libray.add(new Book("포도", "신사임당"));
		libray.add(new Book("혼공3", "강민철"));
		libray.add(new Book("눈마새", "이영도"));
		libray.add(new Book("혼공5", "강민철"));
		
		for(int i=0; i<libray.size(); i++)
			libray.get(i).showInfo();
	}
	

}
