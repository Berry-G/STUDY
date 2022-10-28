package kr.co.ezenac.array02;


class BoxA4
{
	static String name;

	public BoxA4(String name)
	{
		// super
		this.name = name;
	}
}

public class BoxArray
{

	public static void main(String[] args)
	{
		BoxA4[] arr = new BoxA4[3];

		arr[0] = new BoxA4("이순신");
		arr[1] = new BoxA4("이순신1");
		arr[2] = new BoxA4("이순신2");

		System.out.println(BoxA4.name);
		System.out.println(arr[1].name);
		System.out.println(BoxA4.name);
	}
}

