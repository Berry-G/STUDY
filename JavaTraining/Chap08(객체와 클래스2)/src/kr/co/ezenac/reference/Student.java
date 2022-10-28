package kr.co.ezenac.reference;

import javax.security.auth.Subject;

import javax.swing.event.ListDataEvent;

public class Student
{
	int studentId;
	String studentName;
	
	Subject korea;
	Subject math;
	
	public Student(int id, String name)
	{
		studentId = id;
		studentName = name;
		
		korea = new Subject();
		math = new Subject();
	}
	
	public class Subject {

		String subjectName;
		int score;
		int subjectID;
		
	}
	
	public void setKoreaSubject(String name, int score)
	{
		korea.subjectName = name;
		korea.score = score;
	}

	public void setMathSubject(String name, int score)
	{
		// TODO Auto-generated method stub
		math.subjectName = name;
		math.score = score;
		
	}
	
	public void showStudentScore() {
		int total = korea.score + math.score;
		System.out.println(studentName+ "학생의 총점은" + total + "입니다.");
	}


}
