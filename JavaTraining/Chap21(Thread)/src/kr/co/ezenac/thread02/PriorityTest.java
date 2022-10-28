package kr.co.ezenac.thread02;

class PriorityThread extends Thread
{
	@Override
	public void run()
	{
		// TODO Auto-generated method stub
		int sum = 0;
		
		Thread thread = Thread.currentThread();
		System.out.println(thread + " start");
		for(int i=0; i<1000000; i++)
			sum += i;
//		super.run();
		System.out.println(thread.getPriority() + " end");
	}
}
public class PriorityTest
{

}
