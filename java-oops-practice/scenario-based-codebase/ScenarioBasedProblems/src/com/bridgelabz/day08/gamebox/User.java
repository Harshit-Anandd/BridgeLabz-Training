package com.bridgelabz.day08.gamebox;
import java.util.ArrayList;
import java.util.List;

// 5. User Class
public class User {
    private String username;
    // Encapsulation: The list is private, so games can't be added without 'purchase' logic
    private List<Game> ownedGames; 

    public User(String name) {
        this.username = name;
        this.ownedGames = new ArrayList<>();
    }

    public void purchaseGame(Game game, boolean isSeasonalSale) {
        // Check duplication
        if (ownedGames.contains(game)) {
            System.out.println("You already own " + game.getTitle());
            return;
        }

        double finalPrice = game.getPrice();
        
        // Apply Seasonal Offer Logic
        if (isSeasonalSale) {
            finalPrice = game.getDiscountedPrice(20.0); // 20% Off
            System.out.println("Seasonal Offer Applied! 20% OFF.");
        }

        // Add to protected list
        ownedGames.add(game);
        System.out.printf("Purchase Successful: %s for $%.2f\n", game.getTitle(), finalPrice);
        
        // Trigger download automatically
        game.download();
    }

    public void showLibrary() {
        System.out.println("\n--- " + username + "'s Library ---");
        for (Game g : ownedGames) {
            System.out.println("- " + g.getTitle() + " (" + g.genre + ")");
        }
    }
}