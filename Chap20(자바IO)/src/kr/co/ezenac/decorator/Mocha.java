package kr.co.ezenac.decorator;

public class Mocha extends Coffee
{
	public Mocha(Coffee coffee)
	{
//		super(coffee);
	}
	
	@Override
	public void brewing()
	{
		System.out.println("모카 시럽 추가");
	}

}
