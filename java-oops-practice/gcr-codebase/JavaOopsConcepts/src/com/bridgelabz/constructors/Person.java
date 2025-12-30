package com.bridgelabz.constructors;

//Create class Person to demonstrate parameterized and copy constructors.
public class Person {
    private String name;
    private int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy Constructor
    public Person(Person other) {
        this.name = other.name;
        this.age = other.age;
    }

    // Display person details
    public void display() {
        System.out.println("Name: " + this.name + ", Age: " + this.age);
    }

    public static void main(String[] args) {

        // Create original person
        Person p1 = new Person("Alice", 25);
        System.out.println("Original Person:");
        p1.display();

        // Create cloned person using copy constructor
        Person p2 = new Person(p1);
        System.out.println("Cloned Person:");
        p2.display();
    }
}