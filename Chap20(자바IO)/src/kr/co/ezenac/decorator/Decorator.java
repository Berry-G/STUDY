package kr.co.ezenac.decorator;

public abstract class Decorator
{
	Coffee coffee;
	public Decorator(Coffee coffee)
	{
		this.coffee = coffee;
	}
	
	public void brewing()
	{
//		Coffee.brewing();
	}

}
