package kr.co.ezenac.exception;

public class ArrayExceptionTest
{
	public static void main(String[] args)
	{
		int[] arr = new int[5];
		
		try {
			for(int i = 0; i <= 5; i++)
			{
				System.out.println(arr[i]);
			}	
		}
		catch (Exception e) {
			// TODO: handle exception
		}
	}

}
