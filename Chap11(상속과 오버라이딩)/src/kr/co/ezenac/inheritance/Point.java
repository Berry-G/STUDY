package kr.co.ezenac.inheritance;

//독립 클래스
public class Point
{
	int x;
	int y;
	
	public Point()
	{
		this(0,0);
		// TODO Auto-generated constructor stub
	}
	
	public Point(int a, int b)
	{
		System.out.println("Point 클래스의 매개변수가 있는 생성자 호출");
		this.x = a;
		this.y = b;
	}
}
