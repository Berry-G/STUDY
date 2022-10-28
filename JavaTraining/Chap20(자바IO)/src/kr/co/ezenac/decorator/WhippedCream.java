package kr.co.ezenac.decorator;

public class WhippedCream extends Decorator
{
	public WhippedCream(Coffee coffee)
	{
		super(coffee);
	}
	
	@Override
	public void brewing()
	{
		super.brewing();
		System.out.println("크림추가");
	}
}
