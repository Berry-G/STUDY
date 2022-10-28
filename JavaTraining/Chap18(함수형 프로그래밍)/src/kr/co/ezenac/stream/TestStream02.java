package kr.co.ezenac.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestStream02
{
	public static void main(String[] args)
	{
		Stream<Integer> numberStream = Stream.of(3, -5, 7, 10, -3);
		Stream<Integer> filteredNumberStream = numberStream.filter(x -> x > 0);
		List<Integer> filteredNumber = filteredNumberStream.collect(Collectors.toList());
		System.out.println(filteredNumber);

		List<Integer> numberStream2 = Stream.of(3, -5, 7, 10, -3)
				.filter(x -> x > 0)
				.collect(Collectors.toList());
		System.out.println(numberStream2);
		
		User user1 = new User()
				.setId(100)
				.setName("Michael")
				.setVerified(true)
				.setEmailAddress("Michael@gmail.com");
		
		User user2 = new User()
				.setId(101)
				.setName("Tom")
				.setVerified(true)
				.setEmailAddress("Tom@gmail.com");
		
		User user3 = new User()
				.setId(102)
				.setName("John")
				.setVerified(false)
				.setEmailAddress("john@gmail.com");
		
		List<User> users = Arrays.asList(user1, user2, user3);
		List<User> verifiedUsers = users.stream()
		.filter(user -> user.isVerified())
		.collect(Collectors.toList());
		System.out.println(verifiedUsers);
		
		List<User> nonverifiedUsers = users.stream()
				.filter(user -> !(user.isVerified()))
				.collect(Collectors.toList());
		System.out.println(nonverifiedUsers);
	}

}
