package kr.co.ezenac.operator02;

public class DenyTest
{
	public static void main(String[] args)
	{
		boolean power = false;
		System.out.println("power = " + power);
		
		power = !power;
		System.out.println("power = " + power);
		
		power = !power;
		System.out.println("power = " + power);
		
		if(!power)
		{
			System.out.println("if문 실행됨");
		}
		
		if(power)
		{
			System.out.println("if문 실행됨!!!!!!!!!!!");
		}

	}
}
