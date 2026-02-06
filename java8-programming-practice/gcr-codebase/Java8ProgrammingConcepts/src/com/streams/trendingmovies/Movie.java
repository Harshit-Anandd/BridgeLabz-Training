package com.streams.trendingmovies;

//Movie model class
public class Movie {

	private String name;
	private double rating;
	private int year;

	public Movie(String name, double rating, int year) {
		this.name = name;
		this.rating = rating;
		this.year = year;
	}

	public double getRating() { return rating; }
	public int getYear() { return year; }

	@Override
	public String toString() {
		return name + " | Rating: " + rating + " | Year: " + year;
	}
}
