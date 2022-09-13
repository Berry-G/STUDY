package kr.co.ezenac.decorator;

public class Latte extends Coffee
{
	public Latte(Coffee coffee)
	{
		
	}
	
	@Override
	public void brewing()
	{
		System.out.println("우유추가");
	}

}
