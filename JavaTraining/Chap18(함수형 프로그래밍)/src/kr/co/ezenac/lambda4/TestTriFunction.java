package kr.co.ezenac.lambda4;

public class TestTriFunction
{
	public static void main(String[] args)
	{
		TriFunction<Integer, Integer, Integer, Integer> addTreeNums = (x, y, z) -> x + y + z;
		int result = addTreeNums.apply(3, 2, 5);
		System.out.println(result);
	}

}
