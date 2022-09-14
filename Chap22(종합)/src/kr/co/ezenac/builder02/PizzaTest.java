package kr.co.ezenac.builder02;

public class PizzaTest
{
	public static void main(String[] args)
	{
		Pizza nyPizza = new NyPizza.Builder(NyPizza.Size.MEDIUM)
				.addTopping(Pizza.Topping.HAM)
				.addTopping(Pizza.Topping.ONION)
				.build();
		
		System.out.println(nyPizza);
		
		Pizza nyPizza2 = new NyPizza.Builder(NyPizza.Size.MEDIUM)
				.addTopping(Pizza.Topping.MUSHROOM)
				.addTopping(Pizza.Topping.PEPPER)
				.build();
		
		System.out.println(nyPizza2);
		
		Pizza calzone = new Calzone.Builder()
				.addTopping(Pizza.Topping.SAUSAGE)
				.addTopping(Pizza.Topping.ONION)
				.sauceInside()
				.build();
		System.out.println(calzone);
		
		Pizza calzone2 = new Calzone.Builder()
				.addTopping(Pizza.Topping.HAM)
				.addTopping(Pizza.Topping.ONION)
				.build();
		System.out.println(calzone2);
		
		
	}

}
