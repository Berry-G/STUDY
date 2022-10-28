package kr.co.ezenac.array;

public class IntArrayTest
{
	public static void main(String[] args)
	{
		int[] arr1 = new int [3];
		arr1[0] = 100;
		arr1[1] = 90;
		arr1[2] = 80;
		
		int sum = arr1[0] + arr1[1] + arr1[2];
		System.out.println(sum);
		
		int[]arr2 = new int[10];
		int total = 0;
		
		for (int i=0; i<arr2.length; i++)
		{
			arr2[i]=i+1;
			total+=arr2[i];
		}
		System.out.println("total : "+ total);
		
		
	}

}
