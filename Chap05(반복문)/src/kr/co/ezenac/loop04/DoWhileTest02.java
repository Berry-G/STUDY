package kr.co.ezenac.loop04;

import java.util.Scanner;

public class DoWhileTest02
{
	public static void main(String[] args)
	{
		//메시지 입력하세요.
		//프로그램을 종료하려면, q를 입력하세요.
		//>(이젠)
		//입력받은 메시지 : 이젠
		//>(신논현역)
		//입력받은 메시지 : 신논현역
		//>(q)
		//종료
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("메시지를 입력하세요.");
		System.out.println("프로그램을 종료하려면, q를 입력하세요.");
		
		String text;
		do
		{
			System.out.print(">");
			text = scan.nextLine();
			System.out.println("입력받은 메시지 : " + text);
		} while ("q".equals(text) == false);
		
		System.out.println("프로그램을 종료합니다.");
		
		scan.close();
	}

}
