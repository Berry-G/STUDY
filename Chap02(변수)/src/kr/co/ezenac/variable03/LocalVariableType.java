package kr.co.ezenac.variable03;

public class LocalVariableType
{

	public static void main(String[] args)
	{
		/*
		 * 문자 값을 정수타입으로 바꾸게 되면
		 * 아스키 코드 값으로 바뀌어서 출력
		 */
		char ch = 'a';
		int i = ch;
		
		System.out.println("문자 -> 정수 " +i);
		
		int i2 = 100;
		String str = "java" +i2;
		System.out.println(str);
	}

}
