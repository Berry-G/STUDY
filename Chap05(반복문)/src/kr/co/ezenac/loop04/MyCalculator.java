package kr.co.ezenac.loop04;

import java.util.Scanner;

public class MyCalculator
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int x, y;
		
		while(true)
		{
			showMenu();
			char myChar = scan.next().charAt(0);
			
			switch(myChar)
			{
			case '1':
				System.out.print("첫번째 숫자 입력 : ");
				x = scan.nextInt();
				System.out.print("두번째 숫자 입력 : ");
				y = scan.nextInt();
				plus(x, y);
				break;
			case '2':
				System.out.print("첫번째 숫자 입력 : ");
				x = scan.nextInt();
				System.out.print("두번째 숫자 입력 : ");
				y = scan.nextInt();
				minus(x, y);
				break;
			case '3':
				System.out.print("첫번째 숫자 입력 : ");
				x = scan.nextInt();
				System.out.print("두번째 숫자 입력 : ");
				y = scan.nextInt();
				multiple(x, y);
				break;
			case '4':
				System.out.print("첫번째 숫자 입력 : ");
				x = scan.nextInt();
				System.out.print("두번째 숫자 입력 : ");
				y = scan.nextInt();
				divide(x, y);
				break;
			case '0':
				System.out.println("계산기를 종료합니다.");
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				System.out.println();
				break;
			}
			if(myChar == '0') break;
		}
	}
	
	private static void showMenu()
	{
		System.out.println("┌───────────────┐");
		System.out.println("│메뉴를 선택하세요\t│");
		System.out.println("│1. 더하기\t│");
		System.out.println("│2. 빼기\t\t│");
		System.out.println("│3. 곱하기\t│");
		System.out.println("│4. 나누기\t│");
		System.out.println("│0. 종료\t\t│");
		System.out.println("└───────────────┘");
	}
	
	private static void plus(int x, int y)
	{
		System.out.printf("%d + %d = %d\n\n\n", x, y , x+y);
	}
	
	private static void minus(int x, int y)
	{
		System.out.printf("%d - %d = %d\n\n\n", x, y , x-y);
	}
	
	private static void multiple(int x, int y)
	{
		System.out.printf("%d * %d = %d\n\n\n", x, y , x*y);
	}
	
	private static void divide(int x, int y)
	{
		System.out.printf("%d / %d = %.3f\n\n\n", x, y , (double)x/y);
	}

}
