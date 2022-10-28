package kr.co.ezenac.thread03;


class SUMThread extends Thread
{
	@Override
	public void run()
	{
		System.out.println(Thread.currentThread() + "start!!");
		
		cum(1,50);
		System.out.println(Thread.currentThread() + "end!");
		
	}
	
	private int cum(int x, int y)
	{
		System.out.println(Thread.currentThread() + "start!!");
		int sum=0;
		int i;
		for(i=x; i<=y; i++)
		{
			System.out.println("["+i+"]"+x+"~"+y+":"+sum);
			sum+=i;
		}
		
		System.out.printf("작업 완료! %d 부터 %d 까지의 합 : %d\n", x, y, sum);
		System.out.println(Thread.currentThread() + "end!");
		return sum;
	}
}


public class ThreadSUMTest
{
	public static void main(String[] args)
	{
		SUMThread thread1 = new SUMThread();
		SUMThread thread2 = new SUMThread();
		thread1.run();
		thread2.run();
	}

}
