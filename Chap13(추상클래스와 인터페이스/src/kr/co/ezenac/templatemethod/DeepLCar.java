package kr.co.ezenac.templatemethod;

public class DeepLCar extends Car
{
	@Override
	public void stop()
	{
		System.out.println("스스로 정지합니다.");
	}
	
	@Override
	public void drive()
	{
		System.out.println("자율주행 합니다.");
		System.out.println("AI가 핸들을 조종합니다.");
	}

	@Override
	public void startcar()
	{
		// TODO Auto-generated method stub
		if(boot == true)
			System.out.println("이미 다른 자동차에 시동이 걸려있습니다.");
		else if(boot == false)
		{
			System.out.println("자율주행차에 시동을 겁니다.");
			boot = true;
		}
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
		System.out.println("시동을 끕니다.");
		boot=false;
		// TODO Auto-generated method stub
		
	}

	

}
