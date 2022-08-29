package kr.co.Ezenac.goingschool;

public class GoingToSchool
{
	public static void main(String[] args)
	{
		Student stdnt1 = new Student("세종대왕", 10000);
		Student stdnt2 = new Student("신사임당", 50000);
		
		Bus bus100 = new Bus(100);
		Subway subway9 = new Subway(9);
		
		stdnt1.takeBus(bus100);
		stdnt2.takeSubway(subway9);
		
		stdnt1.showInfo();
		stdnt2.showInfo();
		
		bus100.showInfo();
		subway9.showInfo();
	}

}
