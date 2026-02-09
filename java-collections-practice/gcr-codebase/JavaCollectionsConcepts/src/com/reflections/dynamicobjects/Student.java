package com.reflections.dynamicobjects;

public class Student {
	private String name;

	// Constructor used by reflection
	public Student(String name) {
		this.name = name;
	}

	// No-arg constructor
	public Student() {
		this.name = "Unknown";
	}

	@Override
	public String toString() {
		return "Student Name: " + name;
	}
}