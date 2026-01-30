package com.exceptions.nestedtry;

public class NestedTry {
    public void processArray(int[] arr, int index, int divisor) {
        try {
            // Inner try 1: Array Access
            int val = 0;
            try {
                val = arr[index];
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Invalid array index!");
                throw e; // Rethrow to exit method cleanly or stop further processing
            }

            // Inner try 2: Division
            try {
                int res = val / divisor;
                System.out.println("Division Result: " + res);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

        } catch (Exception e) {
            // Outer catch catches rethrown exceptions or others
        }
    }
}