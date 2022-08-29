package kr.co.ezenac.loop04;

import java.util.Scanner;

public class DoWhileTest
{
	public static void main(String[] args)
	{
		//입력받은 숫자의 합을 출력하는 프로그램을 작성하시오, 단 0을 입력하면 반복 그만하고 합을 출력.
		
		Scanner scan = new Scanner(System.in);
		
		int sum = 0;
		int input;
		
		System.out.println("정수를 입력하세요(0 입력 시 종료) :");
		
		do
		{
			input = scan.nextInt();
			sum += input;
		} while(input != 0);
		
		System.out.println("sum = " + sum);
		scan.close();
	}
}
