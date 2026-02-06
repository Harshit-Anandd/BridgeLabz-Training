package com.collectors.wordfrequency;
import java.util.*;
import java.util.stream.Collectors;

public class WordFrequency {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter paragraph:");
		String text = sc.nextLine();

		Map<String, Long> frequency =
				Arrays.stream(text.split(" "))
				.collect(Collectors.groupingBy(
						word -> word.toLowerCase(),
						Collectors.counting()));

		frequency.forEach((word, count) ->
		System.out.println(word + " : " + count));

		sc.close();
	}
}
