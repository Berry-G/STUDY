package kr.co.ezenac.variable03;

public class CharacterTest
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		
		char ch1 = 'A';
		System.out.println(ch1);
		System.out.println((int)ch1);
		
		
		char ch2 = 66;
		System.out.println(ch2);
		System.out.println((int)ch2);
		
		int ch3 = 67;
		System.out.println((char)ch3);
		
		char ch5 = '한';
		System.out.println("문자 5 : " + ch5);
		System.out.println("문자 5 정수형 : " + (int)ch5);		
		
		char ch6 = '\uD55C';	//유니코드 표시할때는 역슬래쉬 u로 표시
		System.out.println("문자 6 : " + ch6);
	}

}
