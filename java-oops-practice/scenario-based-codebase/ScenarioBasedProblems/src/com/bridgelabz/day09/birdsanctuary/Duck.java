package com.bridgelabz.day09.birdsanctuary;

// File: Duck.java (Both)
public class Duck extends Bird implements Flyable, Swimmable {
    public Duck(String id, String name) {
        super(id, name, "Duck");
    }

    @Override
    public void fly() {
        System.out.println(name + " flaps wings and takes flight.");
    }

    @Override
    public void swim() {
        System.out.println(name + " paddles smoothly on the lake.");
    }
}