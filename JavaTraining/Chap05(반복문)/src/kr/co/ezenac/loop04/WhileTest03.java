package kr.co.ezenac.loop04;

import java.util.Scanner;

public class WhileTest03
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		boolean run = true;
		int speed = 0;

		while (run)
		{
			System.out.println();
			System.out.println("=========================================");
			System.out.println("1. 증속     | 2. 감속    | 3. 중지");
			System.out.println("=========================================");

			System.out.print("입력 : ");
			int choice = scan.nextInt();

			switch (choice)
			{
			case 1:
				speed++;
				System.out.println("현재 속도 : " + speed);
				break;
			case 2:
				if (speed == 0)
				{
					System.out.println("속도는 0보다 작을 수 없습니다.");
					break;
				}
				else
				{
					speed--;
					System.out.println("현재 속도 : " + speed);
					break;
				}
			case 3:
				System.out.println("중지");
				run = false;
				break;
			default:
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		scan.close();
	}

}
