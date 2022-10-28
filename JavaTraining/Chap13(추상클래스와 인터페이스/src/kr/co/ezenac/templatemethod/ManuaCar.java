package kr.co.ezenac.templatemethod;

public class ManuaCar extends Car
{
	@Override
	public void stop()
	{
		System.out.println("브레이크를 밟아서 정지합니다.");
	}
	
	@Override
	public void drive()
	{
		System.out.println("사람이 운전합니다.");
		System.out.println("사람이 핸들을 조종합니다.");
	}

	@Override
	public void startcar()
	{
		System.out.println("자동차에 시동을 겁니다.");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void run()
	{
		drive();
		// TODO Auto-generated method stub
		
	}

	@Override
	public void turnoff()
	{
		// TODO Auto-generated method stub
		
	}

}
