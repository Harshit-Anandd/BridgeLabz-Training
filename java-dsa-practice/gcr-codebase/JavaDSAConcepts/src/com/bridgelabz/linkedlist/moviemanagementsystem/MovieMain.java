package com.bridgelabz.linkedlist.moviemanagementsystem;

public class MovieMain {
	
	public static void main(String[] args) {
        MovieManagement mm = new MovieManagement();
        mm.addMovie("Inception", "Nolan", 2010, 8.8);
        mm.addMovie("Avatar", "Cameron", 2009, 7.8);
        
        mm.displayForward();
        mm.displayReverse();
        
        mm.removeMovie("Inception");
        System.out.println("After deleting Inception:");
        mm.displayForward();
    }
	
}