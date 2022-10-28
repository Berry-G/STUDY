package kr.co.ezenac.loop;

//import java.util.Scanner;

//2의 배수 출력.
public class ForTest04
{
	public static void main(String[] args)
	{
//		Scanner scan = new Scanner(System.in);
//		int num = scan.nextInt();
		int num = 2, i=0;
		
		for ( ; ; )
		{
			System.out.printf("%d ",num*i);
			if(i>999) break;
			i++;
		}
	}
}