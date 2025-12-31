package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class Course {
    private String courseName;
    private List<Student> enrolledStudents;

    public Course(String courseName) {
        this.courseName = courseName;
        this.enrolledStudents = new ArrayList<>();
    }

    public void enroll(Student s) {
        if (!enrolledStudents.contains(s)) {
            enrolledStudents.add(s);
            s.addCourse(this); // Maintain link
        }
    }
    
    public String getCourseName() { return courseName; }
    public String toString() { return courseName; }
}