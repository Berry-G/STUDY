package kr.co.ezenac.global;

import java.util.Random;

public class BeforeMian
{
	static int num;
	
	static
	{
		Random ranndom = new Random();		
		num = ranndom.nextInt(100);
	}
	
	public static void main(String[] args)
	{
		System.out.println(num);
	}

}
