package com.bridgelabz.objectmodelling.levelone;

import java.util.ArrayList;
import java.util.List;
public class School {
    private String name;
    private List<Student> students; // Aggregation

    public School(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void admitStudent(Student s) {
        students.add(s);
    }
}