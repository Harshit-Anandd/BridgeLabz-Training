package com.bridgelabz.queue.slidingwindow;

public class SlidingWindowMain {

    public static void main(String[] args) {
        int[] arr = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;
        SlidingWindowMaximum.printMax(arr, k); // Output: 3 3 5 5 6 7
    }
}
