package kr.co.ezenac.array02;

public class StringArray
{
	public static void main(String[] args)
	{
		String[] name = new String[7];

		name[0] = new String("이순신");
		name[1] = new String("이순신2");
		name[2] = new String("이순신3");
		name[3] = new String("이순신4");
		name[4] = new String("이순신5");
		name[5] = new String("이순신6");
		name[6] = new String("이순신7");
		
		int cnum=0;
		for(int i = 0; i<name.length; i++)
		{
			System.out.println(name[i]);
			cnum+=name[i].length();
		}
		System.out.println("글자수 : " + cnum);
	}
}
