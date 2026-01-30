package com.streams.serialization;
import java.io.Serializable;

public class Employee implements Serializable {
	private static final long serialVersionUID = 1L;
	int id;
	String name;
	String department;
	double salary;

	public Employee(int id, String name, String department, double salary) {
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "ID: " + id + ", Name: " + name + ", Dept: " + department + ", Salary: " + salary;
	}
}