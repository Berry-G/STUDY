package kr.co.ezenac.decision02;

import java.util.Scanner;

public class SwitchCaseTest
{
	public static void main(String[] args)
	{
		// 한달이 며칠인지 알려주는 프로그램
		Scanner scan = new Scanner(System.in);

		System.out.print("월 : ");
		int month = scan.nextInt();

		switch (month)
		{
		case 2:
			System.out.println("28일까지 입니다.");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30일 까지 입니다.");
			break;
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31일 까지 입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
			break;
		}
		scan.close();
	}

}
