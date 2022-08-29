package kr.co.ezenac.decision02;

import java.util.Scanner;

public class IfElseIfElse02
{
	public static void main(String[] args)
	{
		System.out.print("나이를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int age = scan.nextInt();
		
		if (age < 8) System.out.println("미취학 아동입니다. 입장료는 1000원 입니다.");
		else if(age < 14) System.out.println("초등학생 입니다. 입장료는 2000원 입니다.");
		else if(age < 20) System.out.println("청소년 입니다. 입장료는 2500원 입니다.");
		else System.out.println("일반인 입니다. 입장료는 3000원 입니다.");
		
		scan.close();
	}

}
