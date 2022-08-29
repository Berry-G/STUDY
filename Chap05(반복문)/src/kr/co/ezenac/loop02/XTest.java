package kr.co.ezenac.loop02;

public class XTest
{
	public static void main(String[] args)
	{
		int x=1;
		int y=7;
		int temp=y;
		
		for(int i=1; i<=temp; i++)
		{
			for(int j=1; j<=temp; j++)
			{
				if(j==x||j==y) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			x++;
			y--;
		}
	}
}