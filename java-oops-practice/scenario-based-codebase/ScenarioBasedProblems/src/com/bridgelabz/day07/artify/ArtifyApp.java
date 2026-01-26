package com.bridgelabz.day07.artify;

// --- Main Execution ---
public class ArtifyApp {
    public static void main(String[] args) {
        User collector = new User("Sophia", 500.0);

        Artwork nft = new DigitalArt("CyberPunk #202", "Neo", 100.0);
        Artwork canvas = new PrintArt("Sunset Oil", "Vincent", 300.0, 50.0);

        // Purchase Digital
        nft.purchase(collector);
        
        // License Digital (Commercial)
        nft.license(collector); // Cost $250

        // Purchase Physical
        canvas.purchase(collector); // Cost $350 (Should fail: 500 - 100 - 250 = 150 left)
    }
}