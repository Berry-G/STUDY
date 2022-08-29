package kr.co.ezenac.singleton;

public class CompanyTest
{
	public static void main(String[] args)
	{
		Company company1 = Company.getInstance();
		Company company2 = Company.getInstance();
		
		System.out.println(company1);
		System.out.println(company2);
		//싱글톤 패턴 : 같은 주소값을 뽑으면 OK
	}

}
