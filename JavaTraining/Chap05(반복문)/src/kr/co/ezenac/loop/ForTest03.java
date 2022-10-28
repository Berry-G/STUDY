package kr.co.ezenac.loop;

//누적 합계가 2000이상 일 때 i값을 출력 하시오.
public class ForTest03
{
	public static void main(String[] args)
	{
		int count = 1;
		int sum = 0;
		
		for (int i=0; i<10; i++, count++) sum+= count;
		System.out.println(sum);
		
		System.out.println("=======================");
		
		int i = 0;
		count = 1;
		sum = 0;
		
		for( ; i<10; i++)
		{
			sum += count;
			count++;
		}
		System.out.println(sum);
	}
}