package kr.co.ezenac.operator02;

import java.util.Scanner;

public class ScannerTest
{
	public static void main(String[] args)
	{
		/*
		 * Scanner 클래스 : 입력을 받기 위한 클래스. 사용하고 나서 반드시 닫아줘야 함.
		 * 여러 숫자가 입력되면 일단 버퍼에 넣고 스페이스나
		 * 탭으로 구분하여 하나씩 입력한 데이터를 변수에 대입하게 됨.
		 */
		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 1 2 3 이렇게 입력하고 엔터를 입력하세요");
		// 입력 대기
		//입력 값은 버퍼에 스페이스나 탭으로 구분해서 저장했다가 엔터를 입력하면 한꺼번에 변수 대입함.
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int num3 = scan.nextInt();
		
		System.out.println("숫자를 1 입력하고 엔터를 입력하세요.");
		int num4 = scan.nextInt();

		System.out.println("숫자를 2 입력하고 엔터를 입력하세요.");
		int num5 = scan.nextInt();

		System.out.println("숫자를 3 입력하고 엔터를 입력하세요.");
		int num6 = scan.nextInt();
		
		System.out.printf("%d %d %d %d %d %d", num1, num2, num3,num4, num5, num6);
		scan.close();
	}

}
