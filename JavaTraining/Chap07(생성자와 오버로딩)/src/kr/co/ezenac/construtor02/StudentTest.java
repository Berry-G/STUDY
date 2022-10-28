package kr.co.ezenac.construtor02;

public class StudentTest
{
	public static void main(String[] args)
	{
		Student student = new Student();
		System.out.println(student.getAge());
//		System.out.println(student.getName());
//		System.out.println(student.getClass());
		System.out.println(student.toString());

		// 매개변수가 있는 생성자 호출
		Student student2 = new Student("이순신", 30);
		System.out.println(student2);

		System.out.println();
		
		Student student3 = new Student("신사임당");
		System.out.println(student3.toString());
		
		System.out.println();
		
		Student student4 = new Student(30);
		System.out.println(student4.toString());
	}

}
