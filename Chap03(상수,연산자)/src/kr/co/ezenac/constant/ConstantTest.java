package kr.co.ezenac.constant;

public class ConstantTest
{

	public static void main(String[] args)
	{
		// 상수는 final
		final int MAX_NUM = 100;
		final int MIN_NUM;
		MIN_NUM = 60;
		
		System.out.println(MAX_NUM);
		System.out.println(MIN_NUM);
		
		int myScore = 50;
		System.out.printf("당신의 학점은 %d점 입니다.\n",myScore);
		
		//상수를 사용하면 가독성이 좋아진다.
		if(myScore < MIN_NUM) System.out.println("당신의 학점 등급은 F입니다.");
	}

}
