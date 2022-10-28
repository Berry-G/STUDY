package kr.co.ezenac.array05;

import java.util.Arrays;

public class Twodimension
{
	public static void main(String[] args)
	{
		int[][] arr = { { 1, 2, 3 }, { 4, 5, 6, 7 } };
		System.out.println(Arrays.toString(arr));
		for (int i = 0; i < arr.length; i++)
		{
			for (int j = 0; j < arr[i].length; j++)
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
			System.out.println("각 행의 길이 : " + arr[i].length);

		}
	}
}
