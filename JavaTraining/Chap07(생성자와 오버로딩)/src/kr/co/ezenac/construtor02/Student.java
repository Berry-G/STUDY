package kr.co.ezenac.construtor02;

public class Student
{
	private String name;
	private int age;

	public Student()
	{
		System.out.println("기본생성자 호출");
	}

	public Student(String name)
	{
		this.name = name;
	}

	// 매개변수가 있는 생성자(오버로딩)
	public Student(String name, int age)
	{
		System.out.println("매개변수가 있는 생성자 호출");
		// super();
		this.name = name;
		this.age = age;
	}

	public Student(int age)
	{
		// TODO Auto-generated constructor stub
		this.age = age;
	}

	public String getName()
	{
		return name;
	}

	public int getAge()
	{
		return age;
	}

	@Override
	public String toString()
	{
		return this.getName() + ", " + getAge();
	}

}
