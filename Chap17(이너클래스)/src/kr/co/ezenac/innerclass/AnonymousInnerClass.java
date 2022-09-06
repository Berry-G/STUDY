package kr.co.ezenac.innerclass;

class Outter
{
	Runnable getRunnable(int i)
	{
		int num = 100;
		
		return new Runnable()
		{
			int localNum = 10;
			
			public void run()
			{
				//i=100;
				//num=200;
				System.out.println("i = " + i);
				System.out.println("num = " + num);
				System.out.println("localNum = " + localNum);
				
				System.out.println();
				
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스의 정적 변수)");
			}
		};
	}
	
	Runnable runner = new Runnable()
	{
		
		@Override
		public void run()
		{
			// 콜백
			System.out.println("Runnable 이 구현이 된 익명 클래스 변수");
			
		}
	};
}

public class AnonymousInnerClass
{
	public static void main(String[] args)
	{
		Outter out = new Outter();
		Runnable runnable = out.getRunnable(10);
		runnable.run();
		
		out.runner.run();
	}
}