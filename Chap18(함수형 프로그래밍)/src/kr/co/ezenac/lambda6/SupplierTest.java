package kr.co.ezenac.lambda6;

import java.util.function.Supplier;

public class SupplierTest
{
	public static void main(String[] args)
	{
		Supplier<String> mySupplier = () -> "Hello EzenIt!";
		System.out.println(mySupplier.get());

		Supplier<Double> mySupplier2 = () -> Math.random();
		System.out.println(mySupplier2.get());
		
		System.out.println();
		printRandomDoubles(mySupplier2, 7);
	}

	public static void printRandomDoubles(Supplier<Double> supplier, int count)
	{
		for (int i = 0; i < count; i++)
		{
			System.out.println(supplier.get());
		}
	}

}
