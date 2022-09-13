package kr.co.ezenac.stream4;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

public class FileTest
{
	public static void main(String[] args)
	{
		//workspace-java 서브 디렉토리와 파일 출력해보기.
		File temp = new File("C:\\workspace-java");
		
		File[] contents = temp.listFiles();
		
		System.out.println("날짜 \t 시간 \t\t 크기 \t\t 이름");
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd a HH:mm");
		System.out.println("===================================================");
		for(File file : contents)
		{
			System.out.print(sdf.format(new Date(file.lastModified())));
			
			if(file.isDirectory())
			{
				System.out.println("\t<DIR>\t\t" + file.getName());
			}
			else
			{
				System.out.print("\t\t" + file.length() + "\t" + file.getName() );
			}
		}
		
	}

}
