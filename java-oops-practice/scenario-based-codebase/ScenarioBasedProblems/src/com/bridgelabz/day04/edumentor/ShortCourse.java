package com.bridgelabz.day04.edumentor;

// 4. Course Hierarchy (Polymorphism)
public class ShortCourse extends Course {
    public ShortCourse(String name) { super(name); }

    @Override
    public void generateCertificate(String learnerName) {
        System.out.println("Generating PDF Certificate for: " + learnerName);
        System.out.println("Awarded for completing Short Module: " + courseName);
    }
}