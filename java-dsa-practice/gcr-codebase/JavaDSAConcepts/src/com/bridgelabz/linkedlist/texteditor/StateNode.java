package com.bridgelabz.linkedlist.texteditor;

public class StateNode {
    String state;
    StateNode next, prev;

    public StateNode(String state) {
        this.state = state;
        this.next = this.prev = null;
    }
}