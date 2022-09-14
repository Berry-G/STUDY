package kr.co.ezenac.builder02;

//COncereteBuilder (빌더 에 선언된 메서드를 구현한 클래스)
//소스 값을 변수로 받아서 생성

public class Calzone extends Pizza
{
	private final boolean sauceInside;
	
	
	public Calzone(Builder builder)
	{
		super(builder);
		this.sauceInside = builder.sauceInside;
	}
	
	public static class Builder extends Pizza.Builder
	{
		private boolean sauceInside = false;

		public Builder sauceInside()
		{
			sauceInside = true;
			return this;
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
			return new Calzone(this);
		}
		
	}
	
	@Override
	public String toString()
	{
		// TODO Auto-generated method stub
		return toppings.toString() + " sauceInside : " + sauceInside;
	}
	
}
