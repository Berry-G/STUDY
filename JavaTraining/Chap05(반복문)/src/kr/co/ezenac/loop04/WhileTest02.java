package kr.co.ezenac.loop04;

public class WhileTest02
{
	public static void main(String[] args)
	{
		//while 사용해서 1~100사이 5와 7의 배수를 출력
		int i=1;
		while(i <= 100)
		{
			if((i%5)==0 && (i%7)==0)
			{
				System.out.println(i);
			}
			i++;
		}
	}

}
