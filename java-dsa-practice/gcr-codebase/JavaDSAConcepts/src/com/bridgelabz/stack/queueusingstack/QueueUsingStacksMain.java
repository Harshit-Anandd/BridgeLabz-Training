package com.bridgelabz.stack.queueusingstack;

public class QueueUsingStacksMain {
	public static void main(String[] args) {
        QueueUsingStacks q = new QueueUsingStacks();
        q.enqueue(1);
        q.enqueue(2);
        q.enqueue(3);
        System.out.println(q.dequeue()); // Output: 1
        System.out.println(q.dequeue()); // Output: 2
    }
}