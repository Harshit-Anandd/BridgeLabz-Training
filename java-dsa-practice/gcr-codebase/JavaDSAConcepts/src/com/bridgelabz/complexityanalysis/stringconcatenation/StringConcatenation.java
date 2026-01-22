package com.bridgelabz.complexityanalysis.stringconcatenation;

public class StringConcatenation {
    public static void main(String[] args) {
        int N = 10_000; // Number of concatenations

        // String Concatenation (Inefficient)
        long start = System.currentTimeMillis();
        String str = "";
        for (int i = 0; i < N; i++) {
        	str += "a";
        }
        long end = System.currentTimeMillis();
        System.out.println("String Time: " + (end - start) + " ms");

        // StringBuilder (Efficient)
        start = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
        	sb.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuilder Time: " + (end - start) + " ms");

        // StringBuffer (Thread-safe)
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < N; i++) {
        	sbf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time: " + (end - start) + " ms");
    }
}