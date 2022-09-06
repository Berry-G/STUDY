package kr.co.ezenac.innerclass;

class OutClass
{
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;

	class InClass
	{
		int inNum = 100;

		// static int sInNum = 200; //이너클래스 에서는 static이 올수 없다.
		void inTest()
		{
			System.out.println("OutClass num = " + num + "(외부 클래스의 인스턴스 변수)");
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 클래스 변수)");
			System.out.println("InClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수)");
		}

		public void usingInClass()
		{
			inClass.inTest();
		}
	}

	static class InStaticClass
	{
		int inNum = 100;
		static int sInNum = 200;

		// 정적 클래스의 일반 메서드
		static void inTest()
		{
			// num += 10; //외부 클래스의 인스턴스 변수 사용 불가
			// inNum += 10; //내부 클래스의 인스턴스 변수 사용 불가
			System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 스태틱 변수 사용)");
			//System.out.println("InClass inNum = " + inNum + "(내부 클래스의 스태틱 변수 사용)");
		}
	}
}

public class InnerClassTest
{
	public static void main(String[] args)
	{
		OutClass outCalss = new OutClass();
		//외부 클래스를 이용하여 내부 클래스 메서드 호출
		OutClass.usingInClass();
		System.out.println();
		
		//외부 클래스를 이용하여
		OutClass.InClass inClass = outCalss.new InClass();
		inClass.inTest();
		System.out.println();
		
		
	}
}