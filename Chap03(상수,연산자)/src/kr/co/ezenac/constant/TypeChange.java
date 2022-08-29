package kr.co.ezenac.constant;

public class TypeChange
{

	public static void main(String[] args)
	{
		//int형에서 최대로 표현할 수 있는 값
		int num1 = 2147483647;
		int num2 = num1 + 2;
		long num4 = 2147483648L;
		System.out.println(num2);
		
		float num5 = 1.0F;
		
		double num6 = 30;	//int -> double 자동 형변환

	}

}
