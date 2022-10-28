package kr.co.ezenac.project.school;

public class Score
{
	private int studentId;
	private Subject subject;
	private int score;
	public Score(int studentId, Subject subject, int score)
	{
		//super();
		this.studentId = studentId;
		this.subject = subject;
		this.score = score;
	}
	public int getStudentId()
	{
		return studentId;
	}
	public void setStudentId(int studentId)
	{
		this.studentId = studentId;
	}
	public Subject getSubject()
	{
		return subject;
	}
	public void setSubject(Subject subject)
	{
		this.subject = subject;
	}
	public int getScore()
	{
		return score;
	}
	public void setScore(int score)
	{
		this.score = score;
	}
	
	

}
