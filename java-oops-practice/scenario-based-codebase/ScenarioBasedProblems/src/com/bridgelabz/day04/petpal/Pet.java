package com.bridgelabz.day04.petpal;

// 2. Base Class: Pet
public abstract class Pet implements Interactable {
    protected String name;
    // Encapsulation: State ranges from 0 to 100
    private int hunger; 
    private int mood;   

    public Pet(String name) {
        this.name = name;
        this.hunger = 50; // Neutral start
        this.mood = 50;
    }

    // Abstract sound method
    public abstract void makeSound();

    @Override
    public void feed() {
        if (hunger > 10) {
            hunger -= 20;
            mood += 10;
            System.out.println(name + " ate yummy food! (Hunger decreased)");
        } else {
            System.out.println(name + " is not hungry.");
        }
    }

    @Override
    public void play() {
        if (hunger < 80) {
            mood += 20;
            hunger += 15; // Playing makes them hungry
            System.out.println(name + " played happily! (Mood improved)");
        } else {
            System.out.println(name + " is too hungry to play.");
        }
    }

    @Override
    public void sleep() {
        mood += 10;
        hunger += 5;
        System.out.println(name + " is sleeping... zzz.");
    }

    public void showStatus() {
        System.out.println("[" + name + "] Hunger: " + hunger + " | Mood: " + mood);
    }
}