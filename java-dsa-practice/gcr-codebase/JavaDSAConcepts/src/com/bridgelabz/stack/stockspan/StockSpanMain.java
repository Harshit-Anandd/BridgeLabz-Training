package com.bridgelabz.stack.stockspan;

import java.util.Arrays;

public class StockSpanMain {

    public static void main(String[] args) {
        int[] prices = {100, 80, 60, 70, 60, 75, 85};
        int[] spans = StockSpan.calculateSpan(prices);
        System.out.println("Spans: " + Arrays.toString(spans));
    }
    
}