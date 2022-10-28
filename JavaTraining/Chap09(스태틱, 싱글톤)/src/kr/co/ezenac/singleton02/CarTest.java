package kr.co.ezenac.singleton02;

public class CarTest
{
	public static void main(String[] args)
	{
		CarFactory carfac1 = CarFactory.getInstance();
		Car bmwi4 = carfac1.createCar();
		Car gv80 = carfac1.createCar();

		System.out.println(bmwi4.getCarId());
		System.out.println(gv80.getCarId());
	}

}
