package kr.co.ezenac.constant;

public class TypeChange02
{
	public static void main(String[] args)
	{
		byte num1 = 1;
		byte num2 = 2;
		// byte result1 = num1 + num2;
		byte result1 = (byte) (num1 + num2); // 강제 형변환
		System.out.println(result1);

		int num3 = 1;
		int num4 = 2;
		int result2 = num3 + num4;

		long num5 = 1;
		long num6 = 2;
		long result3 = num5 + num6;

		long result4 = num4 + num5; // 자동 형변환, int + long
		System.out.println(result4);
		
		float num7 = 1.0f;
		float num8 = 2.0f;
		
		double num9 = 1.0;
		double num10 = 2.0;
		double result5 = num7 + num8;	//자동형변환 float -> double
		System.out.println(result5);

	}

}
