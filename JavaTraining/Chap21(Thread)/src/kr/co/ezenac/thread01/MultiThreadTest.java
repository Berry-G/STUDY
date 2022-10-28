package kr.co.ezenac.thread01;

public class MultiThreadTest
{
	public static void main(String[] args)
	{
		Runnable task1 = () ->
		{
			//20 미만 짝수출력
			for(int i=1;i<20;i++)
			{
				if(i%2==0)
					System.out.println("task1 : " + i);
				try
				{
					Thread.sleep(1000);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		
		Runnable task2 = () ->
		{
			//10미만 수 출력
			for(int i=9; i>0; i--)
			{
				System.out.println("task2 : " + i);
				try
				{
					Thread.sleep(500);
				} catch (InterruptedException e)
				{
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
				
		};

		Thread thread1 = new Thread(task1);
		Thread thread2 = new Thread(task2);
		
		thread1.start();
		thread2.start();
		
	}


}
