package kr.co.ezenac.overloading;

public class AdderTest
{
	public static void main(String[] args)
	{
		AddTest adder = new AddTest();
		
		int iResult = adder.add(10, 50);
		System.out.println(iResult);
		
		int jResult = adder.add(20, 30, 50);
		System.out.println(jResult);
		
		double dResult = adder.add(3.141592, 0.091214);
		System.out.println(dResult);
	}

}
