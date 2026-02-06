package com.collectors.orderrevenue;
import java.util.*;
import java.util.stream.Collectors;

public class RevenueSummary {

	public static void main(String[] args) {

		List<Order> orders = Arrays.asList(
				new Order("Alice", 200),
				new Order("Bob", 300),
				new Order("Alice", 150)
				);

		Map<String, Double> revenue =
				orders.stream()
				.collect(Collectors.groupingBy(
						Order::getCustomer,
						Collectors.summingDouble(
								Order::getAmount)));

		revenue.forEach((cust, total) ->
		System.out.println(cust + " Total: " + total));
	}
}
