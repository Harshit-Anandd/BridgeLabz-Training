package com.bridgelabz.queue.slidingwindow;

import java.util.Deque;
import java.util.LinkedList;

public class SlidingWindowMaximum {
    public static void printMax(int[] arr, int k) {
        Deque<Integer> deque = new LinkedList<>();
        int i;
        
        // Process first k elements
        for (i = 0; i < k; ++i) {
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();
            deque.addLast(i);
        }

        // Process rest of the elements
        for (; i < arr.length; ++i) {
            // The element at the front is the largest of previous window
            System.out.print(arr[deque.peek()] + " ");

            // Remove elements out of the current window
            while (!deque.isEmpty() && deque.peek() <= i - k)
                deque.removeFirst();

            // Remove elements smaller than current being added
            while (!deque.isEmpty() && arr[i] >= arr[deque.peekLast()])
                deque.removeLast();

            deque.addLast(i);
        }
        System.out.print(arr[deque.peek()]); // Print max of last window
    }
}