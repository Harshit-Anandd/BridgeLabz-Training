package com.bridgelabz.inheritance.multilevelinheritance;

public class Course {
    protected String courseName;
    protected int duration; // hours

    public Course(String name, int duration) {
        this.courseName = name;
        this.duration = duration;
    }
}