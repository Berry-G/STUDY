package kr.co.ezenac.builder02;

import java.util.EnumSet;
import java.util.Set;

public abstract class Pizza
{
	
	public enum Topping {HAM, ONION, PEPPER, MUSHROOM, SAUSAGE, OLIVE, SHIRIMP};
	
	final Set<Topping> toppings;
	
	abstract static class Builder
	{
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);
	}

}
