package kr.co.ezenac.lambda2;

@FunctionalInterface
public interface MyNumber
{
	int getMax(int num1, int num2);
	//하나의 식만 존재해야 한다.
	//int getMin(int num1, int num2);
}
