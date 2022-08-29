package kr.co.ezenac.global;

class Cat
{
	static int global;
	int num;
	
	public void printValue(int num)
	{
		this.num = num;
		System.out.println("num : " + this.num);
		System.out.println("global : " + Cat.global);
	}
	
}
public class GlobalVariable
{
	public static void main(String[] args)
	{
		int num1 = 5;
		int num2 = 2;
		System.out.println(num1 + ", " + num2);
		
		Cat cat1 = new Cat();	
		cat1.num = 1;
		Cat.global=10;		//static 변수에 직접 접근
		cat1.printValue(20);
		System.out.println(cat1.num);
		System.out.println(Cat.global);
		
		Cat cat2 = new Cat();
		cat2.num = 2;
		cat2.global = 11;
		cat2.printValue(10);
		System.out.println(cat2.num);
		System.out.println(cat2.global);
		System.out.println(Cat.global);
	}

}
