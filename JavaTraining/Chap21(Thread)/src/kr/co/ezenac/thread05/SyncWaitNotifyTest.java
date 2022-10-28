package kr.co.ezenac.thread05;

import java.util.ArrayList;

class EzenBooks
{
	public ArrayList<String> shelf = new ArrayList<>();
	
	public EzenBooks()
	{
		shelf.add("퀀트의 세계1");
		shelf.add("퀀트의 세계2");
		shelf.add("퀀트의 세계3");
//		shelf.add("퀀트의 세계4");
//		shelf.add("퀀트의 세계5");
//		shelf.add("퀀트의 세계6");
	}
	
	public synchronized String lendBook()
	{
		try
		{
			if(shelf.size()==0)
			{
				System.out.println("책 없음. 기다림");
				wait();
			}
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String book = shelf.remove(0);
		System.out.println(Thread.currentThread().getName() + " : " + book + " 빌림");
		return book;
	}
	
	public synchronized void returnBook(String book)
	{
		shelf.add(book);
		System.out.println(Thread.currentThread().getName() + " : " + book + " 반납함");
//		notifyAll();
	}
}

class Person extends Thread
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		//super.run();
		String title = SyncWaitNotifyTest.ezenbooks.lendBook();
		if(title == null) return;
		try
		{
			Thread.sleep(5000);
			SyncWaitNotifyTest.ezenbooks.returnBook(title);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

public class SyncWaitNotifyTest
{
	public static EzenBooks ezenbooks = new EzenBooks();
	
	
	public static void main(String[] args)
	{
		Person person1 = new Person();
		Person person2 = new Person();
		Person person3 = new Person();
		Person person4 = new Person();
		Person person5 = new Person();
		Person person6 = new Person();
		
		person1.start();
		person2.start();
		person3.start();
		person4.start();
		person5.start();
		person6.start();
		
		
	}

}
