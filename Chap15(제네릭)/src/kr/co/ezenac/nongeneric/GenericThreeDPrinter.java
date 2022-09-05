package kr.co.ezenac.nongeneric;

public class GenericThreeDPrinter<T>
{
	private T material;					//T자료형으로 선언한 참조 변수

	public T getMaterial()
	{
		return material;
	}

	public void setMaterial(T material)
	{
		this.material = material;
	}
	
	@Override
	public String toString()
	{
		return material.toString();
	}

}
