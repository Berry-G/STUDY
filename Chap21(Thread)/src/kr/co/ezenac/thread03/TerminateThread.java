package kr.co.ezenac.thread03;

import java.io.IOException;

public class TerminateThread extends Thread
{
	private boolean flag = false;
	int i;
	
	public TerminateThread(String name)
	{
		super(name);
	}
	
	@Override
	public void run()
	{
		while(flag)
		{
			try
			{
				sleep(500);
			} catch (InterruptedException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}


	}
	
	public void setFlag(boolean flag)
	{
		this.flag = flag;
	}
	
	public static void main(String[] args) throws IOException
	{
		TerminateThread threadA = new TerminateThread("A");
		TerminateThread threadB = new TerminateThread("B");
		TerminateThread threadC = new TerminateThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		int in;
		while(true)
		{
			in = System.in.read();
			if(in == 'A')
				threadA.setFlag(true);
			
			else if(in == 'B')
				break;
			else
				System.out.println("다시 입력");
		}
//		System.out.println("main Thread  END");
	}

}
