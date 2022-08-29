package kr.co.ezenac.member02;

public class Student
{
	public int studentId;
	public String studentName;
	public int grade;
	
	public Student(int studentId, String studentName, int grade)
	{
		this.studentId = studentId;
		this.studentName = studentName;
		this.grade = grade;
	}
	

	public void showStudentInfo()
	{
		System.out.println(studentId + ", " + studentName + ", " + grade);
	}
	

}
