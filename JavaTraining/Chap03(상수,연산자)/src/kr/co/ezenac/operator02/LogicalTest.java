package kr.co.ezenac.operator02;

import java.util.Scanner;

public class LogicalTest
{
	public static void main(String[] args)
	{
		int num1 = 11;
		int num2 = 22;
		boolean result;

		result = (num1 > 1) && (num1 < 10);
		System.out.println("1 초과 10 미만 인가요? " + result);

		result = ((num2 % 2) == 0) || ((num2 % 3) == 0);
		System.out.println("2또는 3의 배수 인가요? " + result);
		//		Scanner
	}
}
