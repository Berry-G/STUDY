package kr.co.ezenac.level;

public class AdvancedLevel extends PlayerLevel
{
	@Override
	public void run()
	{
		System.out.println("천천히 달립니다.");		
	}
	
	@Override
	public void jump()
	{
		System.out.println("높이 jump 합니다.");
	}
	
	@Override
	public void turn()
	{
		System.out.println("turn 못합니다.");
	}
	
	@Override
	public void showLevelMessage()
	{
		System.out.println("******중급자 레벨입니다.******");
	}
}
