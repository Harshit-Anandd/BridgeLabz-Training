package com.bridgelabz.day08.gamebox;

// 3. Derived Class: Arcade Game
public class ArcadeGame extends Game {
    public ArcadeGame(String title, double price) {
        super(title, "Arcade", price, 4.5);
    }

    @Override
    public void playDemo() {
        // Polymorphism: Arcade demos are usually time-limited
        System.out.println("DEMO: Playing " + title + " for 60 seconds (Time Trial mode).");
    }
}