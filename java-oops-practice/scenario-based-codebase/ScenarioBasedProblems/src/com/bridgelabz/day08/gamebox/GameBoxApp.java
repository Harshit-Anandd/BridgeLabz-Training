package com.bridgelabz.day08.gamebox;

// --- Main Execution ---
public class GameBoxApp {
    public static void main(String[] args) {
        User player1 = new User("RetroGamer");

        Game pacman = new ArcadeGame("Pac-Man 3D", 50.0); // Paid
        Game civ = new StrategyGame("Civilization VI", 100.0); // Paid
        Game chess = new StrategyGame("Chess Master", 0.0); // Free Game Constructor

        // 1. Play Demos (Polymorphism)
        System.out.println("--- Demos ---");
        pacman.playDemo();
        civ.playDemo();

        // 2. Purchasing Games
        System.out.println("\n--- Store ---");
        // Buy with Seasonal Sale
        player1.purchaseGame(civ, true); 
        
        // Buy standard price
        player1.purchaseGame(pacman, false);
        
        // Buy free game
        player1.purchaseGame(chess, false);

        // 3. View Encapsulated Library
        player1.showLibrary();
    }
}