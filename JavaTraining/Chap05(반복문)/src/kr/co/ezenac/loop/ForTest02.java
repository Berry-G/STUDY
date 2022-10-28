package kr.co.ezenac.loop;

//누적 합계가 2000이상 일 때 i값을 출력 하시오.
public class ForTest02
{
	public static void main(String[] args)
	{
		int sum = 0, result = 0;
		for (int i = 1; i <= 100; i++)
		{
			sum += i;
			if (sum >= 2000)
			{
				result = i;
				break;
			}
		}
		System.out.println("누적 합계가 2000 이상 일 때 SUM = " + sum + " i = " + result);
		
		main2();
	}
	
	public static void main2()
	{
		int sum = 0, temp=0;
		for (int i = 1; sum < 2000; i++)
		{
			sum += i;
			temp = i;
		}
		System.out.println("누적 합계가 2000 이상 일 때 SUM = " + sum + " i = " + temp);

		
	}

}
