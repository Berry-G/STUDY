package kr.co.ezenac.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileExceptionTest
{
	public static void main(String[] args)
	{
		FileInputStream fis = null;
		try
		{
			fis = new FileInputStream("ezen.txt");
		} catch (FileNotFoundException e) // FileInputStream의 exception
		{
			// TODO: handle exception
			e.printStackTrace();
			System.out.println(e.getMessage());
		} finally		//예외 발새 여부와 관계없이 실행됨. 반환 명령어를 주로 사용.
		{
			if(fis != null)	//널체크를 하고 들어가는게 좋음.
			try
			{
				fis.close();
			} catch (IOException e)
			{
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("항상 수행됩니다.");
		}
		System.out.println("정상 수행 됩니다.");
	}

}
