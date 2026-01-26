package com.bridgelabz.day09.birdsanctuary;

// File: Bird.java
public abstract class Bird {
    protected String id;
    protected String name;
    protected String species;

    public Bird(String id, String name, String species) {
        this.id = id;
        this.name = name;
        this.species = species;
    }

    public String getId() { 
		return id; 
	}
    
    // Common behavior
    public void eat() {
        System.out.println(name + " (" + species + ") is pecking at food.");
    }

    @Override
    public String toString() {
        return String.format("[ID: %-4s] %-10s | Species: %s", id, name, species);
    }
}