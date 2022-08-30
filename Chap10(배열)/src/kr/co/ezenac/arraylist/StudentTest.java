package kr.co.ezenac.arraylist;

/*
 * 학생이 수강한 과목 학점 출력하시오
 * 2022학번 Lee과 2021학번 Shin 두 학생이 있다.
 * Lee 학생은 국어와 수학 2과목 수강했고
 * Shin 학생은 국어,수학,영어 3과목을 수강했습니다.
 * Lee는 국어는 100점, 수학은 70점
 * Shin은 국어70 수학80 영어100점 입니다.
 * ArrayList를 활용하여 두 학생의 과목 성적과 총점을 구하시오.
 */
public class StudentTest
{
	public static void main(String[] args)
	{
		Student StdLee = new Student(2022, "Lee");
		StdLee.addSubject("국어", 100);
		StdLee.addSubject("수학", 70);
		StdLee.showInfo();
		
		Student StdShin = new Student(2021, "Shin");
		StdShin.addSubject("국어", 70);
		StdShin.addSubject("수학", 80);
		StdShin.addSubject("영어", 90);
		StdShin.showInfo();
		
	}

}
