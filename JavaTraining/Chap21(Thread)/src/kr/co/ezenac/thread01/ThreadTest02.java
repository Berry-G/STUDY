package kr.co.ezenac.thread01;

class MyThread2 implements Runnable
{

	@Override
	public void run()
	{
		System.out.println(Thread.currentThread() + "start!!");
		// TODO Auto-generated method stub
		for(int i =0; i<200; i++)
			System.out.print(i + "\t");

		System.out.println(Thread.currentThread() + "end!");
		
	}
	
}

public class ThreadTest02
{
	public static void main(String[] args)
	{
		System.out.println(Thread.currentThread() + "start");
		
		MyThread2 runnable = new MyThread2();
		Thread thread1 = new Thread(runnable);
		thread1.start();
		
		Thread thread2=new Thread(new MyThread2());
		thread2.start();
		
		System.out.println(Thread.currentThread() + "end");
		
		Runnable anonymousThread = new Runnable()
		{
			
			@Override
			public void run()
			{
				// TODO Auto-generated method stub
				System.out.println("anonymous Thread");
			}
		};
		
		anonymousThread.run();
	}

}
