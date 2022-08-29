package kr.co.Ezenac.reference;

public class StudentTest
{
	public static void main(String[] args)
	{
		Student student1 = new Student(100, "이순신");
		student1.setKoreaSubject("국어", 85);
		student1.setMathSubject("수학", 100);
		
		student1.showStudentScore();
	}

}
