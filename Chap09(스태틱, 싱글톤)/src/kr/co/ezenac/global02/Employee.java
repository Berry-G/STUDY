package kr.co.ezenac.global02;

public class Employee
{
	public static int serialNum = 1000;
	String EmplyeeName;
	int EmplyeeId;
	
	public String getEmplyeeName()
	{
		return EmplyeeName;
	}
	public void setEmplyeeName(String emplyeeName)
	{
		EmplyeeName = emplyeeName;
	}
	public int getEmplyeeId()
	{
		EmplyeeId=serialNum;
		serialNum++;
		return EmplyeeId;
	}
	public void setEmplyeeId(int emplyeeId)
	{
		EmplyeeId = emplyeeId;
	}
	
	
	

}
