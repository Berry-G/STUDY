package kr.co.ezenac.inheritance;

public class Triangle extends Shape
{
	public Triangle()
	{
		// TODO Auto-generated constructor stub
		this(new Point(0, 0), new Point(50,50), new Point(100,100));
	}
	
	public Triangle(Point point, Point point2, Point point3)
	{
		System.out.println("Triangle의 매개변수 3개 있는 생성자 호출");
		//this. = new Point();
	}

}
