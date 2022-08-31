package kr.co.ezenac.membership;

public class Customer
{
	protected  int customerId;
	protected String customerName;
	protected String customerGrade;
	int bonusPoint;
	double bonusRatio;
	
//	public Customer()
//	{
//		customerGrade = "SILVER";
//		bonusRatio = 0.01;
//		
//		System.out.println("Customer() 생성자 호출");
//	}

	public Customer(int customerId, String customerName)
	{
		//super();
		this.customerId = customerId;
		this.customerName = customerName;
		
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
		System.out.println("Customer(int, string) 생성자 호출");
	}

	public int getCustomerId()
	{
		return customerId;
	}

	public void setCustomerId(int customerId)
	{
		this.customerId = customerId;
	}

	public String getCustomerName()
	{
		return customerName;
	}

	public void setCustomerName(String customerName)
	{
		this.customerName = customerName;
	}
	
	public String showInfo()
	{
		return customerName + "님의 등급은 "+ customerGrade + "이며, 보너스 포인트는 "+ bonusPoint + "점 입니다.";
	}

	public int calcPrice(int price)
	{
		// TODO Auto-generated method stub
		return price;
	}

	
	

}
