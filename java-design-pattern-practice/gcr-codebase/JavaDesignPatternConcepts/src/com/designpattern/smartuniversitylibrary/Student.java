package com.designpattern.smartuniversitylibrary;
public class Student implements User {

    private String name;

    public Student(String name) {
        this.name = name;
    }

    public void showRole() {
        System.out.println(name + " is a Student (Limited borrowing)");
    }

    public void update(String message) {
        System.out.println(name + " notified: " + message);
    }
}
