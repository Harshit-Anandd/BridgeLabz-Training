package com.bridgelabz.stack.stockspan;

import java.util.Stack;

public class StockSpan {
    public static int[] calculateSpan(int[] prices) {
        int n = prices.length;
        int[] span = new int[n];
        Stack<Integer> stack = new Stack<>(); // Stores indices

        // Span for the first day is always 1
        stack.push(0);
        span[0] = 1;

        for (int i = 1; i < n; i++) {
            // Pop elements that are less than or equal to current price
            while (!stack.isEmpty() && prices[stack.peek()] <= prices[i]) {
                stack.pop();
            }

            // If stack is empty, price is greater than all previous; else difference of indices
            span[i] = (stack.isEmpty()) ? (i + 1) : (i - stack.peek());
            
            stack.push(i);
        }
        return span;
    }
}