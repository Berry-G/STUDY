package kr.co.ezenac.decision02;

import java.util.Scanner;

public class IfElseIfNested
{
	public static void main(String[] args)
	{
		System.out.print("점수를 입력하세요 : ");
		Scanner scan = new Scanner(System.in);
		int score = scan.nextInt();
		
		if (score >= 90)
			{
				if(score >=95) System.out.println("A+입니다.");
				else System.out.println("A입니다.");
			}
		else if (score >= 80)
		{
			if(score >=85) System.out.println("B+입니다.");
			else System.out.println("B입니다.");
		}
		else if (score >= 70)
		{
			if(score >=75) System.out.println("C+입니다.");
			else System.out.println("C입니다.");
		}
		else if (score >= 60)
		{
			if(score >=65) System.out.println("D+ 입니다.");
			else System.out.println("D 입니다.");
		}
		else System.out.println("F 입니다.");
		
		scan.close();
		
	}

}
