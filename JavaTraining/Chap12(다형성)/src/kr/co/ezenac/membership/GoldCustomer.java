package kr.co.ezenac.membership;

/*
 * 골드 혜택
 * 제품 구매시 10% 할인
 * 보너스 포인트 2% 적립
 * 담당 상담원 미배정
 */


public class GoldCustomer  extends Customer
{
	double salesRatio;
	
	public GoldCustomer()
	{
		super(1000,"GOLD");
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		salesRatio = 0.1;
		
	}

	public GoldCustomer(int customerId, String customerName)
	{
		super(customerId, customerName);
		// TODO Auto-generated constructor stub
		this.customerGrade = "GOLD";
		this.bonusRatio = 0.02;
		salesRatio = 0.1;
		this.bonusPoint = 5000;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
	
	@Override
	public int calcPrice(int price)
	{
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	
}
