package com.bridgelabz.linkedlist.socialmediaconnection;

public class SocialMediaMain {

	public static void main(String[] args) {
        SocialMedia sm = new SocialMedia();
        sm.addUser(1, "Alice");
        sm.addUser(2, "Bob");
        sm.addUser(3, "Charlie");

        sm.addConnection(1, 2); // Alice-Bob
        sm.addConnection(2, 3); // Bob-Charlie
        sm.addConnection(1, 3); // Alice-Charlie

        sm.findMutuals(1, 2); // Should show 3 (Charlie)
    }
	
}