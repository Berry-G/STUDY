package kr.co.ezenac.thread01;

public class RunnableInterface
{
	public static void main(String[] args)
	{
		Runnable task = () ->
		{
			try
			{
				Thread.sleep(1000);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			int sum = 0;
			for (int i = 1; i <= 10; i++)
			{
				sum += i;
			}
			String name = Thread.currentThread().getName();
			System.out.println(name + " : " + sum);
		};
		Thread thread = new Thread(task);
		thread.start();
		
		System.out.println("main : " + Thread.currentThread().getName());
	}

}
