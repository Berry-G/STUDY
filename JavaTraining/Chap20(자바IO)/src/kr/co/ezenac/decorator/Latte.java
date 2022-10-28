package kr.co.ezenac.decorator;

public class Latte extends Decorator
{
	public Latte(Coffee coffee)
	{
		super(coffee);
		
	}
	
	@Override
	public void brewing()
	{
		super.brewing();
		System.out.print("우유추가");
	}

}
