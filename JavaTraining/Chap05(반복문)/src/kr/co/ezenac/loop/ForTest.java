package kr.co.ezenac.loop;

public class ForTest
{

	public static void main(String[] args)
	{
		int num = 100;
		int result = 0;
		for (int i = 1; i <= num; i++)
		{
			result += i;
			//System.out.println(result);
		}
		System.out.println("100! = " + result);

	}

}
