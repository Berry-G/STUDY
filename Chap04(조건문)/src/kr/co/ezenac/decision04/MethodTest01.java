package kr.co.ezenac.decision04;

public class MethodTest01
{
	public static void main(String[] args)
	{
		int num1 = 10;
		int num2 = 30;
		
		//call by value (값에 의한 복사)
		int result = add(num1,num2);
		System.out.println("num1 + num2 = " + result);

		result = minus(num1,num2);
		System.out.println("num1 - num2 = " + result);
		
		result = multiply(num1,num2);
		System.out.println("num1 * num2 = " + result);
		
		result = divide(num1,num2);
		System.out.println("num1 / num2 = " + result);
		
		
	}
	
	/*
	 * 메서드 선언부구성
	 * 1. 리턴 타입(반환값) : int, void
	 * 2. 메서드 명
	 * 3. () : 매개변수, 인자값, arguments
	 */
	
	public static int add(int a, int b)
	{
		int x=a+b;
		return x;
	}

	public static int minus(int a, int b)
	{
		int x=a-b;
		return x;
	}

	public static int multiply(int a, int b)
	{
		int x=a*b;
		return x;
	}	

	public static int divide(int a, int b)
	{
		int x=a/b;
		return x;
	}

}
