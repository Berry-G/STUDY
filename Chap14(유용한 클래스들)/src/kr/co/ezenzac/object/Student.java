package kr.co.ezenzac.object;

public class Student implements Cloneable
{
	private int studentId;
	private String studentName;
	public Student(int studentId, String sutudentName)
	{
		this.studentId = studentId;
		this.studentName = studentName;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		if(obj instanceof Student)
		{
			Student stu = (Student)obj;
			if(this.studentId == stu.studentId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		// TODO Auto-generated method stub
		return studentId;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		// TODO Auto-generated method stub
		return super.clone();
	}

}
