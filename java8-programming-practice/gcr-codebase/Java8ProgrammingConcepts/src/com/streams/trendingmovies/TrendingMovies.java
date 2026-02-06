package com.streams.trendingmovies;

import java.util.*;

public class TrendingMovies {

	public static void main(String[] args) {

		List<Movie> movies = Arrays.asList(
				new Movie("Movie A", 8.5, 2022),
				new Movie("Movie B", 9.1, 2023),
				new Movie("Movie C", 7.5, 2021),
				new Movie("Movie D", 8.8, 2023),
				new Movie("Movie E", 9.0, 2024),
				new Movie("Movie F", 8.9, 2024)
				);

		movies.stream()
		.sorted((a, b) -> Double.compare(b.getRating(), a.getRating()))
		.limit(5)
		.forEach(System.out::println);
	}
}
