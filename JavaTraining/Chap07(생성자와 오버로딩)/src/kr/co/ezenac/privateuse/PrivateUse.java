package kr.co.ezenac.privateuse;


class Student1
{
	String name;
	int age;
}

class Student2
{
	public String name;
	private int age;
	
	public Student2(String name, int age)
	{
//		super();
		this.name = name;
		this.age = age;
	}

	public int getAge()
	{
		return age;
	}

	public void setAge(int age)
	{
		//유효성 검사
		if(age < 0 || age > 150)
		{
			System.out.println("나이가 부적절합니다.");
			return;
		}
		this.age = age;
	}
	
	
	
	
}
public class PrivateUse
{
	public static void main(String[] args)
	{
		Student1 stu1 = new Student1();
		Student2 stu2 = new Student2("강아지", 30);
		
		System.out.println(stu1.age);
		System.out.println(stu1.name);
		
		System.out.println(stu2.name);
		System.out.println(stu2.getAge());
		
		Student2 stu3 = new Student2("병아리", -10);
		System.out.printf("%s의 나이는 %d 입니다. \n", stu3.name, stu3.getAge());
		
		Student2 stu4 = new Student2("신사임당", 20);
		stu4.name = "이방원";
		stu4.setAge(-10);
		System.out.printf("%s의 나이는 %d 입니다. \n", stu4.name, stu4.getAge());
		
	}

}
