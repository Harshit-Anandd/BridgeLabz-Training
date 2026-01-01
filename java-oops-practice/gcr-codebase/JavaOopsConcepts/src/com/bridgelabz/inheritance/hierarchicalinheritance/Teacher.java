package com.bridgelabz.inheritance.hierarchicalinheritance;

public class Teacher extends Person {
    private String subject;
    public Teacher(String n, int a, String sub) { super(n, a); this.subject = sub; }
    
    @Override
    public void displayRole() { System.out.println(name + " is a Teacher of " + subject); }
}