package kr.co.ezenac.variable03;

public class VarTest2
{

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		byte b1 = 127;
//		byte b2 = b1+2;		//overflow 129
		byte b2 = (byte) (b1 + 2); // overflow 129
		System.out.println(b1);
		System.out.println("강제캐스팅 후 : " + b2);
//		System.out.println(b2);

		int i1 = b1 + 2; // 자동캐스팅 (형변환 코드 생략가능)
		System.out.println("자동캐스팅 후 : " + i1);

		int i3 = 100;
		float f1 = i3;
		System.out.println("정수 -> 실수 : " + f1);

		float f2 = 10.55f;
		int i4 = (int) f2;
		System.out.println("실수 -> 정수 : " + i4);
		
		double num1 = 30;
		System.out.println(59L + 34.5);
	}

}
