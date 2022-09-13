package kr.co.ezenac.stream2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FIleInputStreamTest3
{
	public static void main(String[] args)
	{
		try(FileInputStream fis = new FileInputStream("input2.txt"))
		{
			byte[] bs = new byte[10];
			int i;
			while((i = fis.read(bs) )!= -1)
			{
//				for(byte b : bs)
//				{
//					System.out.print((char)b);
//				}	//빈 공간의 쓰래기값도 같이 출력됨.
				for(int j=0; j<i; j++)
					System.out.print((char)bs[j]);
				System.out.println(" : " + i + "바이트 읽음");
			}
		} catch (FileNotFoundException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("end");
	}

}
