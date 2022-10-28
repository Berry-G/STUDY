package kr.co.ezenac.stream2;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStream02
{
	public static void main(String[] args) throws IOException
	{
		FileOutputStream fos = new FileOutputStream("output2.txt", true);
		try(fos)
		{
			byte[] bs = new byte[26];
			for(int i=0; i<bs.length; i++)
			{
				bs[i] = (byte) (65 +i);
			}
			fos.write(bs);
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		System.out.println("출력이 완료되었습니다.");
	}
}
