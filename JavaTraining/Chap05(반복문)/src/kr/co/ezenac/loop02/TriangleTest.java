package kr.co.ezenac.loop02;

public class TriangleTest
{
	//안봐도 별찍기다 중첩반복문
	public static void main(String[] args)
	{
		for(int i=0; i<10; i++)
		{
			for(int j= 0; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
