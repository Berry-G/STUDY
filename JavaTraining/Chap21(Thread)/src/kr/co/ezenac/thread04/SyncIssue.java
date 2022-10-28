package kr.co.ezenac.thread04;

public class SyncIssue
{
	public static int money = 0;
	
	public synchronized static void increase()
	{
		money++;
	}
	
	public synchronized static void decrease()
	{
		money--;
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		Runnable task1 = () -> {
			for(int i=0; i<10000; i++)
			{
				increase();
			}
		};
		
		Runnable task2 = () -> {
			for(int i=0; i<10000; i++)
			{
				decrease();
			}
		};

		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
		thread1.join();
		thread2.join();	//쓰레드의 종료를 메인이 기다림.
		
//		Thread.sleep(10000);
		System.out.println(money);
	}
}
