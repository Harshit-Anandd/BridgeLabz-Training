package com.bridgelabz.day03.campusconnect;

import java.util.ArrayList;
import java.util.List;

// 5. Course Class (Aggregation)
public class Course {
    private String courseName;
    private Faculty faculty;
    private List<Student> students;

    public Course(String courseName, Faculty faculty) {
        this.courseName = courseName;
        this.faculty = faculty;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student s) {
        students.add(s);
        s.enrollCourse(this.courseName); // Link back to student logic
    }

    public void showClassList() {
        System.out.println("\nClass List for: " + courseName);
        System.out.println("Instructor: " + faculty.name);
        System.out.println("Students Enrolled: " + students.size());
    }
}