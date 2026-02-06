package com.streams.foreach;

import java.util.Arrays;
import java.util.List;

public class StockLogger {

	public static void main(String[] args) {

		List<Double> prices =
				Arrays.asList(101.2, 103.5, 99.8);

		prices.forEach(p ->
		System.out.println("Price: " + p));
	}
}
