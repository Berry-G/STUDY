package kr.co.ezenac.stream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest03
{
	public static void main(String[] args)
	{
		System.out.println("알파벳 여러 개를 쓰고 [Enter]를 누르세요");
		int i;
		System.out.println("종료하려면 '끝' 이라고 쓰세요");
		try
		{
			InputStreamReader isr = new InputStreamReader(System.in);
			while((i=isr.read()) != '끝')
			{
				System.out.print((char)i);
			}
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
