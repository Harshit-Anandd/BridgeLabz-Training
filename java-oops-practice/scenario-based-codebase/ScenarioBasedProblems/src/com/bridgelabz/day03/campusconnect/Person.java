package com.bridgelabz.day03.campusconnect;

// 2. Base Class: Person
public abstract class Person {
    protected String name;
    protected String email;
    protected String id;

    public Person(String name, String email, String id) {
        this.name = name;
        this.email = email;
        this.id = id;
    }

    // Abstract method for Polymorphism
    public abstract void printDetails();
}