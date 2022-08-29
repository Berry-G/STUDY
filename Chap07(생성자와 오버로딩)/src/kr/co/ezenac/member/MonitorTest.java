package kr.co.ezenac.member;

public class MonitorTest
{
	public static void main(String[] args)
	{
		Monitor monitor1 = new Monitor();
		System.out.println(monitor1.power);
		monitor1.power();
		monitor1.power();
		monitor1.power();
		monitor1.power();
		
		monitor1.channel = 5;
		monitor1.channelUp();
		monitor1.channelUp();
		
		monitor1.channelDown();
		monitor1.channelDown();
		monitor1.channelDown();
		
		System.out.println(monitor1.channel);
	}
}