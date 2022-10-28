package kr.co.ezenac.array;

public class ArrayTest
{
	int num = 0;
	int num2 = 0;
	
	public static void main(String[] args)
	{
		int num3[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		
		System.out.println(num3[2]);
		System.out.println(num3[9]);
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[] {3,5,6,7,8,1};
		
		float arr6[] = new float[9];
		
		//배열에 객체 변수
		System.out.println("배열 arr1 길이 : " + arr1.length);
		System.out.println("배열 arr6 길이 : " + arr6.length);
		
		for(int i=0;i<6;i++)
		{
			System.out.println(arr2[i]);
		}
	}
	

}
