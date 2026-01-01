package com.bridgelabz.inheritance.hierarchicalinheritance;

public class Student extends Person {
    private String grade;
    public Student(String n, int a, String g) { super(n, a); this.grade = g; }
    
    @Override
    public void displayRole() { System.out.println(name + " is a Student in Grade " + grade); }
}