package kr.co.ezenac.operator02;

import java.util.Scanner;

public class ScannerTest02
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
//		System.out.print("정수 한자리 입력 : ");
//		int num = scan.nextInt();
//		if (num < 10)
//			System.out.println("사용자로부터 입력 받은 숫자 : " + num);
//		else
//			System.out.println("잘못된 입력입니다.");
//
//		System.out.print("실수 한자리 입력 : ");
//		double dnum = scan.nextDouble();
//		System.out.println("사용자로부터 입력 받은 숫자 : " + dnum);
//		
		System.out.println("문자열 입력 : ");
//		String cha = scan.next();		//공백을 기준으로 입력, 단어 입력 시 사용
		String cha = scan.nextLine();	//엔터를 기준으로 입력, 문장 입력 시 사용
		System.out.println("입력받은 문자열 : " + cha);
		
		int result = 100;
		System.out.print("문자열을 입력(숫자) : ");
		String temp = scan.nextLine();
		int str3 = Integer.parseInt(temp);	//문자열로 입력받은 숫자들을 문자열이 아니라 숫자로 변환
		
		int total = result + str3;
		System.out.println("연산 결과 : "+ total);
	}
}
