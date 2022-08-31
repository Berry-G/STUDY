package kr.co.ezenac.membership;

public class CustomerTest
{
	public static void main(String[] args)
	{
		Customer customerL = new Customer(20220831, "이순신");
		//customerL.setCustomerName("이순신");
		//customerL.setCustomerId(20220831);
		customerL.bonusPoint = 1000;
		System.out.println(customerL.showInfo());
		
		System.out.println();
		
		VIPCustomer customerS = new VIPCustomer();
		customerS.setCustomerName("신사임당");
		customerS.setCustomerId(20220901);
		customerS.bonusPoint = 10000;
		System.out.println(customerS.showInfo());
		
		VIPCustomer customerF = new VIPCustomer(20220920, "김시민");
		customerF.bonusPoint = 100000;
		System.out.println(customerF.showInfo());
		
		Customer customerL2 = new VIPCustomer(20220902, "이방원");	//upcasting이라고함. 자식 생성자에서 부모 클래스로
		//customerL2는 Customer 클래스의 멤버 변수와 메서드만 사용이 가능하다. VIP는 사용불가.
		//장점 : VIPCustomer 외 다른 자식을 만들었을 때(ex.GOLDCustomer) 객체를 쉽게 만들 수 있음. 확장이 용이.
		customerL2.bonusPoint = 100000;
		System.out.println(customerL2.showInfo());
		
		Customer customerK = new GoldCustomer(20220903, "김시민");
		customerK.bonusPoint = 1000;
		System.out.println(customerK.showInfo());
		
		/*
		 * 상위 클래스 형(TYPE)으로 변수를 선언하고 하위클래스 인스턴스를 생성 할 수 있음.
		 * 하위클래스는 상위클래스의 타입을 내포하고 있으므로 상위클래스로 묵시적 형변환이 가능함.
		 * 상속관계에서 모든 하위 클래스는 상위클래스로 묵시적 형변환이 됨. 그 역은 성립하지 않음.
		 * VIPCUstomer() 생성자의 호출로 인스턴스는 생성되었지만
		 * 타입이 Customer이므로 접근할 수 있는 변수나 메서드는 Customer의 변수와 메서드임.
		 */
		
	}

}
