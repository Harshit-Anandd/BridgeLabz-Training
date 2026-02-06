package com.collectors.librarystatistics;

import java.util.*;
import java.util.stream.Collectors;
import java.util.IntSummaryStatistics;

public class LibraryStatistics {

	public static void main(String[] args) {

		List<Book> books = Arrays.asList(
				new Book("Fiction", 300),
				new Book("Fiction", 500),
				new Book("Science", 400)
				);

		Map<String, IntSummaryStatistics> stats =
				books.stream()
				.collect(Collectors.groupingBy(
						Book::getGenre,
						Collectors.summarizingInt(
								Book::getPages)));

		stats.forEach((genre, s) -> {
			System.out.println("Genre: " + genre);
			System.out.println("Total Pages: " + s.getSum());
			System.out.println("Average Pages: " + s.getAverage());
			System.out.println("Max Pages: " + s.getMax());
			System.out.println();
		});
	}
}
