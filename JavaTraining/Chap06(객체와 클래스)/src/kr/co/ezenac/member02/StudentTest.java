package kr.co.ezenac.member02;

public class StudentTest
{
	public static void main(String[] args)
	{
		Student student = new Student(202208, "이순신", 3);
		
		student.showStudentInfo();
		
		Student 학생2 = new Student(201403, "김영채", 4);
		학생2.showStudentInfo();
	}
}
	