// Create class DeckOfCards that creates a deck of cards, shuffles it, and distributes cards to players

import java.util.Scanner;
public class DeckOfCards {

    // Method to initialize the deck with all 52 cards
    public String[] initializeDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] ranks = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King", "Ace"};
        String[] deck = new String[52];
        int k = 0;
        for (String suit : suits) {
            for (String rank : ranks) {
                deck[k++] = rank + " of " + suit;
            }
        }
		// Return the results
        return deck;
    }

    // Method to shuffle the deck
    public void shuffleDeck(String[] deck) {
        for (int i = 0; i < deck.length; i++) {
            int r = i + (int)(Math.random() * (deck.length - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }
    }

    // Method to distribute cards to players
    public void distributeCards(String[] deck, int players, int cardsPerPlayer) {
        if (players * cardsPerPlayer > deck.length) {
            System.out.println("Not enough cards!");
            return;
        }

		// Display cards for each player
        for (int i = 0; i < players; i++) {
            System.out.println("\nPlayer " + (i + 1) + " cards:");
            for (int j = 0; j < cardsPerPlayer; j++) {
                System.out.println(deck[i * cardsPerPlayer + j]);
            }
        }
    }

    public static void main(String[] args) {
		// Create a Scanner object to read input
        Scanner sc = new Scanner(System.in);
		
		// Create the object and initialize the deck
        DeckOfCards game = new DeckOfCards();
        String[] deck = game.initializeDeck();
        
		// Shuffle the deck
        game.shuffleDeck(deck);

		// Prompt the user to enter the values
        System.out.print("Enter number of players: ");
        int players = sc.nextInt();
        System.out.print("Enter cards per player: ");
        int cards = sc.nextInt();

		// Distribute and display cards
        game.distributeCards(deck, players, cards);
		
		// Close the scanner stream
        sc.close();
    }
}