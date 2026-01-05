package com.bridgelabz.day03.campusconnect;

// 4. Derived Class: Faculty
public class Faculty extends Person {
    private String department;

    public Faculty(String name, String email, String id, String department) {
        super(name, email, id);
        this.department = department;
    }

    public void assignGrade(Student student, double grade) {
        System.out.println("Prof. " + name + " assigning grade to " + student.name);
        student.addGrade(grade);
    }

    @Override
    public void printDetails() {
        System.out.println("--- Faculty Profile ---");
        System.out.println("Prof. " + name + " (" + department + " Dept)");
        System.out.println("Email: " + email);
    }
}