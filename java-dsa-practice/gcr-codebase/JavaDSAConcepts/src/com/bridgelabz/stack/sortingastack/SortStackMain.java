package com.bridgelabz.stack.sortingastack;

import java.util.Stack;

public class SortStackMain {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(30);
        stack.push(10);
        stack.push(50);
        stack.push(20);
        
        System.out.println("Original Stack: " + stack);
		SortStack.sortStack(stack);
        System.out.println("Sorted Stack: " + stack);
    }
}
