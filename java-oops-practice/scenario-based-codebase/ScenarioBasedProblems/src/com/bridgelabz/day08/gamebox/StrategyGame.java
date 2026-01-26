package com.bridgelabz.day08.gamebox;

// 4. Derived Class: Strategy Game
public class StrategyGame extends Game {
    public StrategyGame(String title, double price) {
        super(title, "Strategy", price, 4.8);
    }

    @Override
    public void playDemo() {
        // Polymorphism: Strategy demos are usually a tutorial level
        System.out.println("DEMO: Starting Tutorial Level 1 for " + title + ".");
    }
}