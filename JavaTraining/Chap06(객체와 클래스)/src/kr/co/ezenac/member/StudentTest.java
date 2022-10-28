package kr.co.ezenac.member;

public class StudentTest
{
	public static void main(String[] args)
	{
		Student 학생1 = new Student();
		학생1.showStudentInfo();
		학생1.studentName = "이순신";
		학생1.address = "서울 강남구";
		학생1.showStudentInfo();
		
		Student 학생2 = new Student();
		학생2.studentName = "김달래";
		학생2.address = "서울 서초구";
		학생2.showStudentInfo();

		System.out.println(학생1);
		System.out.println(학생2);
	}

}
