package kr.co.ezenac.builder02;

import java.util.Objects;

//COncereteBuilder (빌더 에 선언된 메서드를 구현한 클래스)
//size값을 필수로 받아서 생성

public class NyPizza extends Pizza
{
	public enum Size {SMALL, MEDIUM, LARGE}
	private final Size size;
	
	public static class Builder extends Pizza.Builder
	{
		private final Size size;

		Builder(Size size)
		{
			//requireNonNull() : null체크를 하고 null이 아닐 때 그 값을 반환.
			this.size = Objects.requireNonNull(size);
		}
		
		@Override
		protected kr.co.ezenac.builder02.Pizza.Builder self()
		{
			// TODO Auto-generated method stub
			return this;
		}

		@Override
		Pizza build()
		{
			// TODO Auto-generated method stub
			return new NyPizza(this);
		}
		
	}
	
	public NyPizza(Builder builder)
	{
		super(builder);
		this.size = builder.size;
	}

}
