package kr.co.ezenac.constructor03;

public class Car
{
	String color;
	String gearType;
	int door;

	public Car()
	{
		this.color = "λΈλ";
		this.gearType = "μλ";
		this.door = 4;
	}

	public Car(String color, String gearType, int door)
	{
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}

	@Override
	public String toString()
	{
		return this.color + ", " + this.gearType + ", " + this.door;
	}

}
