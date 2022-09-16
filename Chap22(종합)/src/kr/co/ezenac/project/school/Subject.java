package kr.co.ezenac.project.school;

import java.util.ArrayList;

import kr.co.ezenac.project.ui.Constant;

public class Subject
{
	private int subjectId;		//과목 고유번호
	private String subjectName;	//과목 이름
	private String gradeType;	//학점 부여 방식 (기본은 A~F 부여)
	private ArrayList<Student> students = new ArrayList<>();
	
	public Subject(int subjectId, String subjectname)
	{
		//super();
		this.subjectId = subjectId;
		this.subjectName = subjectname;
	}
	public int getSubjectId()
	{
		return subjectId;
	}
	public void setSubjectId(int subjectId)
	{
		this.subjectId = subjectId;
	}
	public String getSubjectName()
	{
		return subjectName;
	}
	public void setSubjectName(String subjectName)
	{
		this.subjectName = subjectName;
	}
	public String getGradeType()
	{
		if(this.getSubjectId() == Constant.GOLF)
			this.gradeType="PF_TYPE";
		return gradeType;
	}
	public void setGradeType(String gradeType)
	{
		this.gradeType = gradeType;
	}
	public ArrayList<Student> getStudents()
	{
		return students;
	}
	public void register(Student student)
	{
		students.add(student);
	}
	
	

}
