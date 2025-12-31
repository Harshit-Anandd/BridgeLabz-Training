package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class Student {
    private String name;
    private List<Course> courses;

    public Student(String name) {
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course c) {
        if (!courses.contains(c)) {
            courses.add(c);
        }
    }

    public String getName() { return name; }
    public void viewCourses() {
        System.out.println(name + " is enrolled in: " + courses);
    }
}