package com.streams.insuranceclaim;

import java.util.*;
import java.util.stream.Collectors;

public class ClaimAnalysis {

	public static void main(String[] args) {

		List<Claim> claims = Arrays.asList(
				new Claim("Health", 10000),
				new Claim("Health", 20000),
				new Claim("Vehicle", 15000)
				);

		claims.stream()
		.collect(Collectors.groupingBy(
				Claim::getType,
				Collectors.averagingDouble(Claim::getAmount)
				))
		.forEach((type, avg) ->
		System.out.println(type + " Avg: " + avg));
	}
}