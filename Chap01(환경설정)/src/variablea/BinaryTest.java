package variablea;

public class BinaryTest
{
	public static void main(String[] args)
	{
		int num = 254;	// 10의 2진수 1010
		int bNum = 0b1010;	//0b가 앞에들어가면 2진수
		int oNum = 012;		//0이 앞에들어가면 8진수
		int xNum = 0xA;		//앞에들어가면 16진수

		String binary = Integer.toBinaryString(num);
		String Oct = Integer.toOctalString(num);
		String hex = Integer.toHexString(num);
		
		System.out.print("10진수 : ");
		System.out.println(num);
		System.out.print("2진수 : ");
		System.out.println(binary);
		System.out.print("8진수 : ");
		System.out.println(Oct);
		System.out.print("16진수 : ");
		System.out.println(hex);
	}
}