package kr.co.ezenac.innerclass;

class Outer
{
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i)
	{
		int num = 100;
		
		class MyRunnable implements Runnable
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
				
				System.out.println("outNum = " + outNum + "(외부 클래스의 인스턴스 변수)");
				System.out.println("Outer.sNum = " + Outer.sNum + "(외부 클래스의 정적 변수)");
			}
		}
		return new MyRunnable();
	}
}
public class LocalInnerClass
{
	public static void main(String[] args)
	{
		Outer outer = new Outer();
		Runnable runner = outer.getRunnable(30);
		runner.run();
	}

}
