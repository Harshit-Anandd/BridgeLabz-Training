package com.bridgelabz.strings.stringbuffer.comparison;

public class PerformanceComparison {
    public static void main(String[] args) {
        int iterations = 1000000; // 1 million
        String text = "hello";

        // Test StringBuffer
        long startTime = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < iterations; i++) {
            sbf.append(text);
        }
        long endTime = System.nanoTime();
        System.out.println("StringBuffer Time: " + (endTime - startTime) + " ns");

        // Test StringBuilder
        startTime = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < iterations; i++) {
            sb.append(text);
        }
        endTime = System.nanoTime();
        System.out.println("StringBuilder Time: " + (endTime - startTime) + " ns");
    }
}