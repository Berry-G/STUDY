package kr.co.ezenac.array04;

import java.util.Arrays;

public class ArrayUtilMethod02
{
	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4};
		double[] arr2 = {1.1, 4.4, 3.3, 2.2};
		String[] arr3 = {"이순신", "신사임당", "단군", "김시민"};
		
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		Arrays.sort(arr3);
		
		System.out.println(Arrays.toString(arr1));
		System.out.println(Arrays.toString(arr2));
		System.out.println(Arrays.toString(arr3));
	}

}
