package kr.co.ezenac.decision02;

import java.util.Scanner;

public class IfElseIfNested02
{
	public static void main(String[] args)
	{
		System.out.print("성별을 입력하세요(남자:1 / 여자:2) : ");
		Scanner scan = new Scanner(System.in);
		int sex = scan.nextInt();
		if(sex==1)
		{
			System.out.print("나이를 입력하세요 : ");
			int age = scan.nextInt();
			if (age < 20) System.out.println("미성년자에게는 아직 신체등급이 부여되지 않습니다.");
			else
			{
				System.out.print("신체등급을 입력하세요 : ");
				int physicLv = scan.nextInt();
				
				if (physicLv <= 3) System.out.println("현역 입대입니다.");
				else if (physicLv == 4) System.out.println("공익 입니다.");
				else System.out.println("면제 입니다.");
			}
		}
		else if(sex==2)System.out.println("여성에게는 국방의 의무가 없습니다.");
		else System.out.println("잘못입력하셨습니다.");
		scan.close();
	}
}
