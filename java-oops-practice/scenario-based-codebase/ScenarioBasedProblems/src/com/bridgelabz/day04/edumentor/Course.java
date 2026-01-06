package com.bridgelabz.day04.edumentor;

// 4. Course Hierarchy (Polymorphism)
public abstract class Course implements Certifiable {
    protected String courseName;

    public Course(String courseName) {
        this.courseName = courseName;
    }
}