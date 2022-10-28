package kr.co.ezenac.project.school.view;

import java.util.ArrayList;

import kr.co.ezenac.project.grade.BasicEvaluation;
import kr.co.ezenac.project.grade.GolfEvaluation;
import kr.co.ezenac.project.grade.GradeEvaluation;
import kr.co.ezenac.project.grade.MajorEvaluation;
import kr.co.ezenac.project.school.School;
import kr.co.ezenac.project.school.Score;
import kr.co.ezenac.project.school.Student;
import kr.co.ezenac.project.school.Subject;
import kr.co.ezenac.project.ui.Constant;

public class GenerateGradeDisplay
{
	School schoool = School.getInstance();
	
	public static final String TITLE = "과목 학점 결과 >>>\n";
	public static final String LINE = "-----------------------------------------------------------\n";
	public static final String HEADER = "이름\t\t학번\t\t필수과목\t\t점수\t학점\n";
	public static final String LINE2 = "===========================================================\n";

	private StringBuffer buffer = new StringBuffer();
	
	public String getDisplay()
	{
		ArrayList<Subject> subjects = schoool.getSubjects();
		for(Subject subject : subjects)
		{
			makeHeader(subject);
			makeBody(subject);
			makefooter(subject);
		}
		return buffer.toString();		
	}

	private void makefooter(Subject subject)
	{
		// TODO Auto-generated method stub
		buffer.append("\n");
		
	}

	private void makeBody(Subject subject)
	{
		ArrayList<Student> students = subject.getStudents();
		for(int i=0; i<students.size(); i++)
		{
			Student student = students.get(i);
			buffer.append(student.getStudentName());
			
			if(student.getStudentName().length() >= 6)
				buffer.append("\t");
			else
				buffer.append("\t\t");
			buffer.append(student.getStudentId());
			buffer.append("\t" + student.getMajorSubject().getSubjectName());
			GetScoreGrade(student, subject);	//학생 별 해당과목 학점 계산
			
			buffer.append("\n");
			
		}
		buffer.append(GenerateGradeDisplay.LINE2);
	}

	public void GetScoreGrade(Student student, Subject subject)
	{
		ArrayList<Score> scoreList = student.getScores();
		int majorId = student.getMajorSubject().getSubjectId();
		
		//학점 평가 클래스
		GradeEvaluation[] gradeEvaluations = {new BasicEvaluation(), new MajorEvaluation(), new GolfEvaluation()};
		for(int i=0; i<scoreList.size(); i++)
		{
			//학생이 가진 점수들
			Score score = scoreList.get(i);
			if(score.getSubject().getSubjectId() == subject.getSubjectId())
			{
				String grade;
				if(score.getSubject().getSubjectId() == majorId)
				{
					grade = gradeEvaluations[Constant.SAB_TYPE].getGrade(score.getScore());
				}
				else if(score.getSubject().getGradeType() == "PF_TYPE")
				{
					grade = gradeEvaluations[Constant.PF_TYPE].getGrade(score.getScore());
				}
				else
				{
					grade = gradeEvaluations[Constant.AB_TYPE].getGrade(score.getScore());
				}
				buffer.append("\t\t" + score.getScore() + "\t");
				buffer.append(grade);
			}
		}
	}

	private void makeHeader(Subject subject)
	{
		// TODO Auto-generated method stub
		buffer.append("\t" + subject.getSubjectName());
		buffer.append(GenerateGradeDisplay.TITLE);
		buffer.append(GenerateGradeDisplay.LINE);
		buffer.append(GenerateGradeDisplay.HEADER);
		buffer.append(GenerateGradeDisplay.LINE);
		
		}
}
