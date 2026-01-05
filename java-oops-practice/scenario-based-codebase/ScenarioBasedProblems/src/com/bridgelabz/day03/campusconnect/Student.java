package com.bridgelabz.day03.campusconnect;

import java.util.ArrayList;
import java.util.List;

// 3. Derived Class: Student
public class Student extends Person implements CourseActions {
    // Encapsulation: Grades are private
    private List<Double> grades; 
    private List<String> enrolledCourses;

    public Student(String name, String email, String id) {
        super(name, email, id);
        this.grades = new ArrayList<>();
        this.enrolledCourses = new ArrayList<>();
    }

    public void addGrade(double grade) {
        if (grade >= 0 && grade <= 10.0) {
            grades.add(grade);
        } else {
            System.out.println("Invalid Grade: " + grade);
        }
    }

    // Logic: Calculate GPA
    public double calculateGPA() {
        if (grades.isEmpty()) return 0.0;
        double sum = 0;
        for (double g : grades) sum += g;
        return sum / grades.size();
    }

    @Override
    public void enrollCourse(String courseName) {
        enrolledCourses.add(courseName);
        System.out.println("Student " + name + " enrolled in " + courseName);
    }

    @Override
    public void dropCourse(String courseName) {
        if (enrolledCourses.remove(courseName)) {
            System.out.println("Student " + name + " dropped " + courseName);
        } else {
            System.out.println("Error: Not enrolled in " + courseName);
        }
    }

    @Override
    public void printDetails() {
        System.out.println("--- Student Profile ---");
        System.out.println("ID: " + id + " | Name: " + name);
        System.out.println("GPA: " + String.format("%.2f", calculateGPA()));
        System.out.println("Courses: " + enrolledCourses);
    }
}