package kr.co.ezenac.level;

/*
 * 상속이 제한되는 final
 * 1) 변수
 * 		- final 변수는 상수를 의미함.
 * 2) 메서드
 * 		- final 메서드는 하위 클래스에서 오버라이딩을 할 수 없음.
 * 3) 클래스
 * 		- final 클래스는 상속을 할 수 없음.
 */
public abstract class PlayerLevel
{
	public abstract void run();

	public abstract void jump();

	public abstract void turn();

	public abstract void showLevelMessage();

	final public void go(int count)
	{
		run();
		for(int i = 0 ; i < count ; i ++)
		{
			jump();
		}
		turn();
	}
}
