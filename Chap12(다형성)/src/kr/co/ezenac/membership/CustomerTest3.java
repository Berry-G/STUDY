package kr.co.ezenac.membership;

import java.util.ArrayList;

public class CustomerTest3
{
	public static void main(String[] args)
	{
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer customerL = new Customer(202208, "이순신");
		Customer customerS = new Customer(202209, "신사임당");
		Customer customerL1 = new GoldCustomer(202210, "이성계");
		Customer customerC = new GoldCustomer(202211, "최영");
		Customer customerK = new VIPCustomer(202212,"김유신",77777);
//		customerK.bonusPoint = 10000;
		
		customerList.add(customerL);
		customerList.add(customerS);
		customerList.add(customerL1);
		customerList.add(customerC);
		customerList.add(customerK);
		
		System.out.println("========고객 정보 출력========");
		for(Customer customer : customerList)
		{
			System.out.println(customer.showInfo());
		}

		System.out.println("========할인율과 보너스 포인트 계산========");
		int pirce = 10000;
		
		for(Customer customer : customerList)
		{
			int cost = customer.calcPrice(pirce);
			System.out.println(customer.getCustomerName() + "님이 " + cost +"원 지불하셨습니다.");
		}
		
		System.out.println("========보너스 포인트 계산========");
		
		for(Customer customer : customerList)
		{
//			customer.calcPrice(pirce);	//두번 구매하면
			int point = customer.bonusPoint;
			System.out.println(customer.getCustomerName() + "님의 보너스 포인트는 " + point +"점 입니다.");
		}
		
		
	}

}
