package kr.co.ezenac.stream.travel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class CustomerTest
{
	public static void main(String[] args)
	{
		Customer customer1 = new Customer("이순신", 40, 100);
		Customer customer2 = new Customer("나대용", 20, 100);
		Customer customer3 = new Customer("권율", 14, 50);
		
		List<Customer> customerLIst = new ArrayList<>();
		customerLIst.add(customer1);
		customerLIst.add(customer2);
		customerLIst.add(customer3);

		//System.out.println(customerLIst.toString());
		customerLIst.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));
		int total = customerLIst.stream().mapToInt(c -> c.getPrice()).sum();
		System.out.println("총 여행 비용은 " + total + "입니다.");
		
		System.out.println("===20세 이상 고객 명단 정렬하여 출력===");
		customerLIst.stream().filter(c -> c.getAge() >= 20).map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
	}

}
