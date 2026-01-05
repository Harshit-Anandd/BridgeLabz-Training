package com.bridgelabz.stack.queueusingstack;

import java.util.Stack;

public class QueueUsingStacks {
    private Stack<Integer> stack1 = new Stack<>(); // For enqueue
    private Stack<Integer> stack2 = new Stack<>(); // For dequeue

    // Enqueue operation: Push to stack1
    public void enqueue(int x) {
        stack1.push(x);
    }

    // Dequeue operation: Pop from stack2
    public int dequeue() {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                throw new RuntimeException("Queue is empty");
            }
            // Move elements from stack1 to stack2
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }
}