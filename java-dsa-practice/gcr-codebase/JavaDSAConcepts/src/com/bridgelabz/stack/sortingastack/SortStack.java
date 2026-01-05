package com.bridgelabz.stack.sortingastack;

import java.util.Stack;

public class SortStack {
    // Method to sort the stack
    public static void sortStack(Stack<Integer> stack) {
        if (!stack.isEmpty()) {
            // Remove the top element
            int top = stack.pop();
            // Sort the remaining stack recursively
            sortStack(stack);
            // Insert the top element back in sorted order
            sortedInsert(stack, top);
        }
    }

    // Helper method to insert element in sorted order
    private static void sortedInsert(Stack<Integer> stack, int element) {
        if (stack.isEmpty() || element > stack.peek()) {
            stack.push(element);
            return;
        }
        // If top is greater, remove it and recurse
        int temp = stack.pop();
        sortedInsert(stack, element);
        // Put the top back
        stack.push(temp);
    }
}