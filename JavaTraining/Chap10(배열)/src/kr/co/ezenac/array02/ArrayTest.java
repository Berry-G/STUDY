package kr.co.ezenac.array02;

import java.util.Arrays;

public class ArrayTest
{
	public static void main(String[] args)
	{
		int[] arr1 = new int [10];
		
		
		for(int i=0; i<arr1.length; i++)
		{
			arr1[i] = (int)( Math.random() * 10 +1);
			if(i!=9) System.out.print(arr1[i] + ", "); 
			else System.out.println(arr1[i]);
		}
			
		System.out.println();
		
		System.out.println(Arrays.toString(arr1));
	}

}
