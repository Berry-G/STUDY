package kr.co.ezenac.operator02;

import java.util.Scanner;

public class ConditionTest
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.print("점수를 입력하세요 : ");
		int score = scan.nextInt();


		char grade = (score >= 90) ? 'A' : ((score >= 80) ? 'B' : 'C');
		//삼항연산자는 중첩이 가능하다.
		System.out.println("당신의 등급 : " + grade);

		scan.close();
	}

}
