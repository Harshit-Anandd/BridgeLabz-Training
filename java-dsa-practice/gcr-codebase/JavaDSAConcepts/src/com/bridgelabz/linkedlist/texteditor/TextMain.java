package com.bridgelabz.linkedlist.texteditor;

public class TextMain {
	
	public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        editor.addState("Hello");
        editor.addState("Hello World");
        
        editor.undo(); // Back to "Hello"
        editor.redo(); // Back to "Hello World"
        editor.addState("Hello Java"); // New branch
        editor.redo(); // Should fail
    }
	
}