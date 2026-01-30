package com.generics.universitymanagement;

//Generic class bounded to CourseType
public class Course<T extends CourseType> {
	private String courseName;
	private T type;

	public Course(String courseName, T type) {
		this.courseName = courseName;
		this.type = type;
	}

	@Override
	public String toString() {
		return "Course: " + courseName + " | Evaluation: " + type.getEvaluationMethod();
	}
}