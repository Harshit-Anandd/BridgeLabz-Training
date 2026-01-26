package com.bridgelabz.day09.birdsanctuary;

// File: Penguin.java (Swims only)
public class Penguin extends Bird implements Swimmable {
    public Penguin(String id, String name) {
        super(id, name, "Penguin");
    }

    @Override
    public void swim() {
        System.out.println(name + " dives deep into the icy water.");
    }
}