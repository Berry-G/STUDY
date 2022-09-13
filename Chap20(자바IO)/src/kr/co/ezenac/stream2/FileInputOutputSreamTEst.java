package kr.co.ezenac.stream2;

import java.io.FileInputStream;
import java.io.FileOutputStream;

/*
 * output2.txt 를 읽어 들여서 그대로 output3에 출력(복붙)
 */
public class FileInputOutputSreamTEst
{
	public static void main(String[] args)
	{
		try(FileInputStream fis = new FileInputStream("output2.txt"))
		{
			int i;
			FileOutputStream fos = new FileOutputStream("output3.txt");
			while((i = fis.read()) != -1)
			{
				fos.write(i);
			}
			System.out.println("입력완료.");
			fos.close();
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("end");
	}

}
