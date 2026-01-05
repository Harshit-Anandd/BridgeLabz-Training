package com.bridgelabz.linkedlist.librarymanagementsystem;

public class LibraryMain {
	
	public static void main(String[] args) {
        LibraryManagement lm = new LibraryManagement();
        lm.addBook(101, "Java Programming", "Author A");
        lm.addBook(102, "Data Structures", "Author B");
        
        lm.updateStatus(101, "Checked Out");
        lm.removeBook(102);
        lm.countBooks();
    }
	
}