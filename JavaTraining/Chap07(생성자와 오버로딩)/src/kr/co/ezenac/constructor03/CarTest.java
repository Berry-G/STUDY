package kr.co.ezenac.constructor03;

public class CarTest
{
	public static void main(String[] args)
	{
		Car car = new Car();
		System.out.println(car.toString());
		
		Car car2 = new Car("green", "자동", 2);
		System.out.println(car2.toString());
	}

}
