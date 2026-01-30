package com.regex.dateextraction;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {
	public void extractDates(String text) {
		String regex = "\\b\\d{2}/\\d{2}/\\d{4}\\b";
		Pattern pattern = Pattern.compile(regex);
		Matcher matcher = pattern.matcher(text);

		boolean found = false;
		while (matcher.find()) {
			System.out.println(matcher.group());
			found = true;
		}
		if (!found) System.out.println("No dates found.");
	}
}