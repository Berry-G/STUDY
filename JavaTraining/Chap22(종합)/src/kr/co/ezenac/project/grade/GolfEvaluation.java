package kr.co.ezenac.project.grade;

//골프 과목은 70점 넘으면 패스

public class GolfEvaluation implements GradeEvaluation
{

	@Override
	public String getGrade(int score)
	{
		String grade;
		
		if(score >= 70 && score <= 100)
			grade = "PASS";
		else
			grade = "FAIL";
		return grade;
	}


}
