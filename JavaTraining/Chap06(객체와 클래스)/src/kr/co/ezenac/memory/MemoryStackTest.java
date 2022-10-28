package kr.co.ezenac.memory;

public class MemoryStackTest
{
	public static void main(String[] args)
	{
		int num1, num2;
		num1 = 10;
		num2 = 20;
		
		MemoryStack add = new MemoryStack();
		int result=add.add(num1,num2);
		System.out.println(result);
	}

}
