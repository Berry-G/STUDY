package kr.co.ezenac.operator;

public class AirthmeticTest
{
	public static void main(String[] args)
	{
		int num1 = 7, num2 = 3;
		System.out.println("num1 + num2 = " + (num1 + num2));
		System.out.println("num1 - num2 = " + (num1 - num2));
		System.out.println("num1 * num2 = " + (num1 * num2));
		System.out.println("num1 / num2 = " + (num1 / num2));
		System.out.println("num1 % num2 = " + (num1 % num2));

		int result;

		try
		{
			result = 10 / 0;	//산술연산 예외 발생하는 부분
		} catch (ArithmeticException e)
		{
			System.out.println("예외 발생 : "
					+ "" + e);
		}
	}

}
