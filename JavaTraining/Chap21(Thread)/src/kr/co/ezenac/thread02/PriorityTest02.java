package kr.co.ezenac.thread02;

class PriorityThread2 extends Thread
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

public class PriorityTest02
{
	public static void main(String[] args)
	{
		int i;
		for(i=Thread.MIN_PRIORITY; i<Thread.MAX_PRIORITY; i++)
		{
			PriorityThread2 pt = new PriorityThread2();
			pt.setPriority(i);
			pt.start();			
		}
		
		PriorityThread2 pt1 = new PriorityThread2();
		PriorityThread2 pt2 = new PriorityThread2();
		PriorityThread2 pt3 = new PriorityThread2();

		pt1.setPriority(Thread.MIN_PRIORITY);
		pt2.setPriority(Thread.NORM_PRIORITY);
		pt3.setPriority(Thread.MAX_PRIORITY);
		
		pt1.start();
		pt2.start();
		pt3.start();
	}

}
