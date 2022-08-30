package kr.co.ezenac.array04;

import java.util.Arrays;

public class ArrayUtilMethod
{
	public static void main(String[] args)
	{
		int[] arr1 = new int[10];
		int[] arr2 = new int[8];
		
		Arrays.fill(arr1, 3);
		
		System.arraycopy(arr1, 0, arr2, 3, 4);
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		
		int[] arr3 = Arrays.copyOfRange(arr2, 2, 5);
		System.out.println(Arrays.toString(arr3));
		
		Arrays.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		
	}

}
