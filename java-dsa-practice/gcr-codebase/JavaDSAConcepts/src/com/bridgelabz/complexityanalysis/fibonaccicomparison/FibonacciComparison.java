package com.bridgelabz.complexityanalysis.fibonaccicomparison;

public class FibonacciComparison {

    // Recursive: O(2^N)
    public static int fibRecursive(int n) {
        if (n <= 1) return n;
        return fibRecursive(n - 1) + fibRecursive(n - 2);
    }

    // Iterative: O(N)
    public static int fibIterative(int n) {
        if (n <= 1) return n;
        int a = 0, b = 1, sum;
        for (int i = 2; i <= n; i++) {
            sum = a + b;
            a = b;
            b = sum;
        }
        return b;
    }

    public static void main(String[] args) {
        int N = 40; // High enough to show recursion lag

        long start = System.nanoTime();
        fibRecursive(N);
        long end = System.nanoTime();
        System.out.println("Recursive Time: " + (end - start) + " ns");

        start = System.nanoTime();
        fibIterative(N);
        end = System.nanoTime();
        System.out.println("Iterative Time: " + (end - start) + " ns");
    }
}