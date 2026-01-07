package com.bridgelabz.readers.challenge.comparisons;

import java.io.*;

public class FullComparison {
    public static void main(String[] args) {
        // Part 1: String Concatenation Benchmark
        int iterations = 1000000;
        long start, end;

        start = System.nanoTime();
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<iterations; i++) sb.append("a");
        end = System.nanoTime();
        System.out.println("StringBuilder (1M appends): " + (end - start) + " ns");

        start = System.nanoTime();
        StringBuffer sbf = new StringBuffer();
        for(int i=0; i<iterations; i++) sbf.append("a");
        end = System.nanoTime();
        System.out.println("StringBuffer (1M appends): " + (end - start) + " ns");

        // Part 2: File Reading Benchmark (requires a large file)
        File hugeFile = new File("src/com/bridgelabz/readers/challenge/comparisions/large_file.txt");
        if(hugeFile.exists()) {
            try {
                // FileReader Benchmark
                start = System.nanoTime();
                try (BufferedReader br = new BufferedReader(new FileReader(hugeFile))) {
                    while (br.readLine() != null); // Just reading
                }
                end = System.nanoTime();
                System.out.println("FileReader time: " + (end - start) + " ns");

                // InputStreamReader Benchmark
                start = System.nanoTime();
                try (BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(hugeFile)))) {
                    while (br.readLine() != null); // Just reading
                }
                end = System.nanoTime();
                System.out.println("InputStreamReader time: " + (end - start) + " ns");
            } catch (IOException e) { e.printStackTrace(); }
        } else {
            System.out.println("Please create 'large_file.txt' for Part 2.");
        }
    }
}