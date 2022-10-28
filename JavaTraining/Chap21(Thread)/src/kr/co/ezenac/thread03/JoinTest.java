package kr.co.ezenac.thread03;

public class JoinTest extends Thread
{
	int start;
	int end;
	int total;
	
	public JoinTest(int start, int end)
	{
		this.start = start;
		this.end = end;
	}
	
	@Override
	public void run()
	{
		int i;
		for(i=start; i<=end; i++)
		{
			System.out.println("["+i+"]"+start+"~"+end+"="+total);
			total += i;
		}
		System.out.println(start+"      end!!!!!!!!!!!!!");
	}
	
	public static void main(String[] args) throws InterruptedException
	{
		System.out.println(Thread.currentThread() + " start");
		
		JoinTest jt1 = new JoinTest(1,  50);
		JoinTest jt2 = new JoinTest(51, 100);
		
		jt1.start();
		jt2.start();

		jt1.join();		//main 쓰레드는 waiting 상태가 됨.
		jt2.join();
		
		int sum=jt1.total+jt2.total;
		
		System.out.println("******************"+jt1.total + "+" + jt2.total + "=" + sum);
		
	}
}
