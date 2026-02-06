package com.collectors.studentgrouping;
import java.util.*;
import java.util.stream.Collectors;

public class StudentGroupingMain {

	public static void main(String[] args) {

		List<Student> students = Arrays.asList(
				new Student("Alice", "A"),
				new Student("Bob", "B"),
				new Student("Charlie", "A"),
				new Student("David", "B")
				);

		// grouping students by grade
		Map<String, List<String>> grouped =
				students.stream()
				.collect(Collectors.groupingBy(
						Student::getGrade,
						Collectors.mapping(
								Student::getName,
								Collectors.toList())));

		grouped.forEach((grade, names) ->
		System.out.println("Grade " + grade + " : " + names));
	}
}
