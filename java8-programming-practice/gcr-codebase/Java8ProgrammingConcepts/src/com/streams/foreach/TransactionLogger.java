package com.streams.foreach;
import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.List;

public class TransactionLogger {

	public static void main(String[] args) {

		List<String> ids =
				Arrays.asList("TX100", "TX101");

		ids.forEach(id ->
		System.out.println(
				LocalDateTime.now()
				+ " - Transaction: " + id));
	}
}
