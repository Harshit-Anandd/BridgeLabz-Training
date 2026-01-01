package com.bridgelabz.inheritance.assistedproblems;

public class Animal {
    private String name;
    private int age;

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }

    public String getName() { return name; }
    public int getAge() { return age; }
}