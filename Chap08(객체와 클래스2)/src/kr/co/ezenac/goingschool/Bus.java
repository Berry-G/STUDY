package kr.co.Ezenac.goingschool;

public class Bus
{
	int busNumber;
	int passengerCount;
	int money;


		
	public Bus(int busNumber)
	{
		//super();
		this.busNumber = busNumber;
	}


	public void ride(int money)
	{
		this.money += money;
		passengerCount++;
	}
	
	
	public void showInfo()
	{
		System.out.println(busNumber + "번의 승객은 " + passengerCount + "명이고, 수입은 " + money + "원 입니다.");
	}
}
