package com.collectors.salaryanalysis;
import java.util.*;
import java.util.stream.Collectors;

public class SalaryAnalysis {

	public static void main(String[] args) {

		List<Employee> employees = Arrays.asList(
				new Employee("IT", 60000),
				new Employee("HR", 50000),
				new Employee("IT", 70000)
				);

		Map<String, Double> avgSalary =
				employees.stream()
				.collect(Collectors.groupingBy(
						Employee::getDepartment,
						Collectors.averagingDouble(
								Employee::getSalary)));

		avgSalary.forEach((dept, avg) ->
		System.out.println(dept +
				" Avg Salary: " + avg));
	}
}
