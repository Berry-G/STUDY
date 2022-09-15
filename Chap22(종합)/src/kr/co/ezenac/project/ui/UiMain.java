package kr.co.ezenac.project.ui;

import kr.co.ezenac.project.school.School;
import kr.co.ezenac.project.school.Score;
import kr.co.ezenac.project.school.Student;
import kr.co.ezenac.project.school.Subject;
import kr.co.ezenac.project.school.view.GenerateGradeDisplay;

/**
 * 
 * 1. 문제정의
 * 		Ezen 학교가 있습니다.
 * 		이 학교에는 5명의 학생들이 수업을 듣고 있습니다.
 * 		과목은 2과목 : 국어, 수학	이 있고.
 * 		각 학생은 두 과목을 모두 수강합니다.
 * 		전공은 국어교육학과와 컴퓨터공학과 2가지가 있습니다.
 * 		국어교육학과는 국어가 필수과목이고, 컴퓨터공학과는 수학이 필수과목입니다.
 * 		
 * 		이번 학기에 성적이 아래와 같이 나왔습니다.
 * 		=================================================================
 * 		이름			학번				전공			필수과목	국어점수	수학점수
 * 		=================================================================
 * 		스티브잡스		20220915		국어교육학과		국어		95		56
 * 		이순신			20220916		컴퓨터공학과		수학		95		98
 * 		리누스토발즈		20220917		국어교육학과		국어		100		88
 * 		제임스고슬링		20220918		국어교육학과		국어		89		95
 * 		이도			20220919		컴퓨터공학과		수학		83		56
 * 
 * 		학점을 부여하는 방법은 여러가지가 있습니다.
 * 		단순히 A~F를 부여하는 방법, S~F를 부여하는 방법 등이 있습니다.
 * 		
 * 		일반과목이라면 A~F로, 필수과목이라면 S~F로 분류
 * 		점수에 따른 학점 부여 방식은 아래와 같다.
 * 
 * 		필수과목학점
 * 		S		A		B		C		D		F
 * 		==============================================
 * 		95~100	90~94	80~89	70~79	60~69	60미만
 * 
 * 		일반과목학점
 * 		A		B		C		D		F
 * 		======================================
 * 		90~100	80~89	70~79	55~69	55미만
 * 
 * 		학점 결과를 아래와 같이 나올 수 있도록 구현하라.
 * 
 * 		국어과목 학점 결과 >>> 
 * 		=================================================
 * 		이름			학번			필수과목	점수		학점
 * 		=================================================
 * 		스티브잡스		20220915	국어		95		S
 * 		이순신			20220916	수학		95		A
 * 		리누스토발즈		20220917	국어		100		S
 * 		제임스고슬링		20220918	국어		89		B
 * 		이도			20220919	수학		83		B
 * 
 * 		수학과목 학점 결과 >>> 
 * 		=================================================
 * 		이름			학번			필수과목	점수		학점
 * 		=================================================
 * 		스티브잡스		20220915	국어		56		D
 * 		이순신			20220916	수학		98		S
 * 		리누스토발즈		20220917	국어		88		B	
 * 		제임스고슬링		20220918	국어		95		A	
 * 		이도			20220919	수학		56		F
 * 
 * 2. UML 클래스 정의, 관계
 * 3. 구현
 * 4. 테스트
 * 
 */

public class UiMain
{
	School ezenSchool = School.getInstance();
	Subject korean;
	Subject math;
	Subject golf;
	
	GenerateGradeDisplay gradeDisplay = new GenerateGradeDisplay();
	
	
	public static void main(String[] args)
	{
		UiMain uiMain = new UiMain();
		uiMain.createSubject();		//시험과목 생성
		uiMain.createStudent();		//학생 생성

		String displayResult = uiMain.gradeDisplay.getDisplay();
		System.out.println(displayResult);
	}


	private void createStudent()
	{
		Student student1 = new Student("스티브잡스", 20220915, korean);
		Student student2 = new Student("이순신", 20220916, math);
		Student student3 = new Student("리누스토발츠", 20220917, korean);
		Student student4 = new Student("제임스고슬링", 20220918, korean);
		Student student5 = new Student("이도", 20220919, math);

		ezenSchool.addStudent(student1);
		ezenSchool.addStudent(student2);
		ezenSchool.addStudent(student3);
		ezenSchool.addStudent(student4);
		ezenSchool.addStudent(student5);
		
		korean.register(student1);
		korean.register(student2);
		korean.register(student3);
		korean.register(student4);
		korean.register(student5);

		math.register(student1);
		math.register(student2);
		math.register(student3);
		math.register(student4);
		math.register(student5);
		
		golf.register(student1);
		golf.register(student2);
		golf.register(student3);

		addScoreForStudent(student1, korean, 95);
		addScoreForStudent(student1, math, 56);
		addScoreForStudent(student1, golf, 95);
		
		addScoreForStudent(student2, korean, 95);
		addScoreForStudent(student2, math, 98);
		addScoreForStudent(student2, golf, 85);
		
		addScoreForStudent(student3, korean, 100);
		addScoreForStudent(student3, math, 88);
		addScoreForStudent(student3, golf, 55);
		
		addScoreForStudent(student4, korean, 89);
		addScoreForStudent(student4, math, 95);
		
		addScoreForStudent(student5, korean, 83);
		addScoreForStudent(student5, math, 56);
		
	}


	private void addScoreForStudent(Student student, Subject subject, int score)
	{
		Score score1 = new Score(student.getStudentId(), subject, score);
		student.addSubjectScore(score1);

		
	}


	public void createSubject()
	{

		korean = new Subject(Constant.KOREAN, "국어");
		math = new Subject(Constant.MATH, "수학");
		golf = new Subject(Constant.GOLF, "골프");
		
		ezenSchool.addSubject(korean);
		ezenSchool.addSubject(math);
		ezenSchool.addSubject(golf);
	}

}
