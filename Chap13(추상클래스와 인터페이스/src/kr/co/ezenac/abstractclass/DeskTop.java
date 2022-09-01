package kr.co.ezenac.abstractclass;

public class DeskTop extends Computer
{
	@Override
	void display()
	{
		System.out.println("DeskTop display");
	}
	
	@Override
	void typing()
	{
		System.out.println("Desktop typing");
	}
	
	@Override
	public void turnoff()
	{
		System.out.println("Desktop turnOff");
	}

}
