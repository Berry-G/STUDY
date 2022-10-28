package kr.co.ezenac.exception;

public class AutoCloseableTestMain
{
	public static void main(String[] args)
	{

		// TODO Auto-generated method stub
		AutoCloseableTest obj = new AutoCloseableTest();
		try (obj)
		{
			System.out.println("프로그램 실행");
			throw new Exception();
			//close 자동 호출
		} catch (Exception e)
		{
			// TODO: handle exception
			System.out.println("예외 처리 부분입니다.");
		}


	}

}
