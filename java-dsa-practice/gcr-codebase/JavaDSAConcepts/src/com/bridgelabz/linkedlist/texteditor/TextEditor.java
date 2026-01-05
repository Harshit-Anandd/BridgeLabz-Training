package com.bridgelabz.linkedlist.texteditor;

public class TextEditor {
    StateNode current; // Tracks current state

    public TextEditor() {
        // Initial empty state
        current = new StateNode("");
    }

    // 1. Add State (Type/Action)
    public void addState(String text) {
        StateNode newState = new StateNode(text);
        newState.prev = current;
        current.next = newState;
        current = newState;
        // Any forward history (redo) is lost when a new action occurs
    }

    // 2. Undo
    public void undo() {
        if (current.prev != null) {
            current = current.prev;
            System.out.println("Undo: " + current.state);
        } else {
            System.out.println("Nothing to undo.");
        }
    }

    // 3. Redo
    public void redo() {
        if (current.next != null) {
            current = current.next;
            System.out.println("Redo: " + current.state);
        } else {
            System.out.println("Nothing to redo.");
        }
    }
}