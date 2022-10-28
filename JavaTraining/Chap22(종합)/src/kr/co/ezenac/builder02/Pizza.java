package kr.co.ezenac.builder02;

import java.util.EnumSet;
import java.util.Objects;
import java.util.Set;

public abstract class Pizza
{

	public enum Topping
	{
		HAM, ONION, PEPPER, MUSHROOM, SAUSAGE
	};

	final Set<Topping> toppings;

	public Pizza(Builder builder)
	{
		this.toppings = builder.toppings.clone();
	}

	abstract static class Builder
	{
		EnumSet<Topping> toppings = EnumSet.noneOf(Topping.class);

		protected abstract Builder self();

		public Builder addTopping(Topping topping)
		{
			toppings.add(Objects.requireNonNull(topping));
			return self();
		}

		public Builder sauceInside()
		{
			return self();
		}

		abstract Pizza build();
	}
	
	@Override
	public String toString()
	{
		return toppings.toString();
	}

}
