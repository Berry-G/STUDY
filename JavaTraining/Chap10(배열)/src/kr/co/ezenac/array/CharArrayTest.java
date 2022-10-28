package kr.co.ezenac.array;

public class CharArrayTest
{
	public static void main(String[] args)
	{
		char[] alphabetLarge = new char[26];
		for(int i = 0; i<alphabetLarge.length; i++)
		{
			alphabetLarge[i]=(char) ('A' + i);
			System.out.printf("%c ",alphabetLarge[i]);
		}
		
		System.out.println();
		
		char[] alphabetSmall = new char[26];
		for(int i = 0; i<alphabetSmall.length; i++)
		{
			alphabetSmall[i]=(char) ('a' + i);
			System.out.printf("%c ",alphabetSmall[i]);
		}
		
		System.out.println();
		System.out.println();
		for(int i=0; i<alphabetLarge.length; i++)
		{
			System.out.println(alphabetLarge[i] + ", " + (int)alphabetLarge[i]);
		}
		
		System.out.println();
		System.out.println();
		
		//향상된 for문
		for (char ch : alphabetLarge)
		{
			System.out.println(ch + ", " + (int)ch);
		}
	}

}
