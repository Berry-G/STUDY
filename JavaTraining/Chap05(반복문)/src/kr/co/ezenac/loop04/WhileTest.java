package kr.co.ezenac.loop04;

public class WhileTest
{
	public static void main(String[] args)
	{
		int i = 1;
		while(true)
		{
			System.out.println(i);
			if(i >= 100) break;
			i++;
		}
	}

}
