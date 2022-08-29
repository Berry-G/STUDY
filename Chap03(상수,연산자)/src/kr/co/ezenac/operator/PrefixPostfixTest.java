package kr.co.ezenac.operator;

public class PrefixPostfixTest
{
	public static void main(String[] args)
	{
		int num = 10;
		System.out.println(++num);		//num값 증가 후 출력
		System.out.println(num);
		
		System.out.println(num++);		//num값 증가 후 출력
		System.out.println(num);
		
		System.out.println("-------------------------------------");
		
		int x = 10, y = 10;
		System.out.println("x = " + x++);
		System.out.println("x = " + x++);
	}

}
