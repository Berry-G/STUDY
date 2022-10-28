package kr.co.ezenac.templatemethod;

public class CarTest
{
	public static void main(String[] args)
	{
		Car dlCar = new DeepLCar();
		dlCar.startcar();
		dlCar.run();
		dlCar.startcar();
		dlCar.turnoff();
		System.out.println();
		
		
		Car manualCar = new ManuaCar();
		manualCar.startcar();
		manualCar.run();
		System.out.println();
		manualCar.turnoff();
	}

}
