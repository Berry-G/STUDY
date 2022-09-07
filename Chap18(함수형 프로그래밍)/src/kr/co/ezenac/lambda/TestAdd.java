package kr.co.ezenac.lambda;

public class TestAdd
{
	public static void main(String[] args)
	{
		//Add addF = (int x, int y) -> {return x+y};
		//Add addF = (int x, int y) -> x+y;
		Add addF = (x,y) -> x+y;
		
		System.out.println(addF.add(3, 5));
		
	}

}
