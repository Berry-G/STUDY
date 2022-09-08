package kr.co.ezenac.exception;

public class AutoCloseableTest implements AutoCloseable
{
	@Override
	public void close() throws Exception
	{
		System.out.println("프로그램 종료합니다.");
	}
}
