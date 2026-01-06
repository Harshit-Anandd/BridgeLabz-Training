package com.bridgelabz.day04.petpal;

// --- Main Execution ---
public class PetPalApplicaiton {
    public static void main(String[] args) {
        Pet myDog = new Dog("Bruno");
        Pet myCat = new Cat("Luna");

        myDog.makeSound();
        myDog.play();
        myDog.feed();
        myDog.showStatus();

        System.out.println("---");

        myCat.makeSound();
        myCat.sleep();
        myCat.showStatus();
    }
}