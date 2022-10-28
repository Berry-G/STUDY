package kr.co.ezenac.decorator;

public class Mocha extends Decorator
{
	public Mocha(Coffee coffee)
	{
		super(coffee);
	}
	
	@Override
	public void brewing()
	{
		super.brewing();
		System.out.print("모카 시럽 추가");
	}

}
