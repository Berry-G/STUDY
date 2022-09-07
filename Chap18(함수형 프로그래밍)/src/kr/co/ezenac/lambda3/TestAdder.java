package kr.co.ezenac.lambda3;

import java.util.function.Function;

public class TestAdder
{
	public static void main(String[] args)
	{
		Function<Integer, Integer> myAdder = new Adder();
		int result = myAdder.apply(10);
		System.out.println(result);
	}

}
