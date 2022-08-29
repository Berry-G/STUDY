package kr.co.ezenac.member;

public class Monitor
{
	//맴버변수(필드)
	String color;		//모니터의 색상
	int channel;
	int volume;
	boolean power;
	
	//멤버메서드
	public void power()
	{
		power = !power;
	}

	public void channelUp()
	{
		channel++;
	}
	
	public void channelDown()
	{
		channel--;
	}
}
