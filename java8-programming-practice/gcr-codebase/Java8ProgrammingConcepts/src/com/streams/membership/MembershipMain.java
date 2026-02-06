package com.streams.membership;
import java.time.LocalDate;
import java.util.*;

public class MembershipMain {

	public static void main(String[] args) {

		List<Member> members = Arrays.asList(
				new Member("John", LocalDate.now().plusDays(10)),
				new Member("Alice", LocalDate.now().plusDays(40)));

		members.stream()
		.filter(m -> m.getExpiry()
				.isBefore(LocalDate.now()
						.plusDays(30)))
		.forEach(System.out::println);
	}
}
