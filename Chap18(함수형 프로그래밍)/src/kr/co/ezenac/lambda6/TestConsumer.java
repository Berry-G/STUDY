package kr.co.ezenac.lambda6;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class TestConsumer
{

	public static void main(String[] args)
	{
		Consumer<String> myConsumer = (String str) -> System.out.println(str);
		myConsumer.accept("Good Afternoon!");
		myConsumer.accept("Seoul Korea!");
		
		Consumer<Integer> myConsumer2 = (Integer inte) -> System.out.println(inte);
		myConsumer2.accept(369);


		List<Integer> integersList = Arrays.asList(4, 2, 3);
		Consumer<Integer> myConsumer3 = x -> System.out.println("정수형 입력값 처리 : " + x);
		myConsumer3.accept(12);
		
		spend(integersList, myConsumer3);

		Consumer<Integer> myConsumer4 = x -> System.out.println("정수형 리스트 입력값 처리 : " + x);
		spend(integersList, myConsumer4);
		
		Consumer<Double> myConsumer5 = x -> System.out.println("더블형 리스트 입력값 처리 : " + x);
		List<Double> doubeList = Arrays.asList(1.1, 1.2, 1.3, 1.4, 2.5, 2.6);
		spend(doubeList, myConsumer5);
	}
	
	public static <T> void spend(List<T> inputs, Consumer<T> consumer)
	{
		for(T input : inputs)
			consumer.accept(input);
	}

}
