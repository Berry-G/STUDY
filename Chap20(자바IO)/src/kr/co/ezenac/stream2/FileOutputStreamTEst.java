package kr.co.ezenac.stream2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTEst
{
	public static void main(String[] args)
	{
		try(FileOutputStream fos = new FileOutputStream("output.txt"))
		{
			for(int i=65; i<70; i++)
				fos.write(i);
			System.out.println("출력이 완료되었습니다.");
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
