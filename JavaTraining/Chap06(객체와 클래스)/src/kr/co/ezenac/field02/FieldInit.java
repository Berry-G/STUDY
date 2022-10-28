package kr.co.ezenac.field02;

public class FieldInit
{
	byte byteField;			// 1byte
	short shortField;		// 2byte
	int intField;			// 4byte
	long longField;			// 8byte
	
	boolean booleanField;	//1byte
	char charField;			//2byte
	
	float floatField;		//4byte
	double doubleField;		//8byte
	
	/*
	 * 클래스의 멤버변수 멤버변수(필드)의 값들을 수시로 확인하고자 할때나,
	 * 원하는 포맷으로 맴버변수들을 출력하고자 할 때 사용한다.
	 */
	@Override
	public String toString()
	{
		String str = "byteField : " + byteField +
					"shortField :" + shortField +
					"intField : " + intField +
					"longField : " + longField +
					"booleanField : " + booleanField +
					"charField : " + charField +
					"floatField : " + floatField +
					"doubleField : " + doubleField;
		
		return str;
					
	}

}
