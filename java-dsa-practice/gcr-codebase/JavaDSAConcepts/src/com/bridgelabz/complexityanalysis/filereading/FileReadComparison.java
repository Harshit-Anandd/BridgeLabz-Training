package com.bridgelabz.complexityanalysis.filereading;

import java.io.*;

public class FileReadComparison {
    public static void main(String[] args) {
        File file = new File("src/com/bridgelabz/complexityanalysis/filereading/largefile.txt"); // Ensure this file exists for testing
        
        // Create a dummy large file if not exists
        if (!file.exists()) createDummyFile(file);

        // Benchmark FileReader
        try (FileReader fr = new FileReader(file)) {
            long start = System.currentTimeMillis();
            while (fr.read() != -1); // Read char by char
            long end = System.currentTimeMillis();
            System.out.println("FileReader Time: " + (end - start) + " ms");
        } catch (IOException e) { e.printStackTrace(); }

        // Benchmark InputStreamReader with Buffer
        try (InputStreamReader isr = new InputStreamReader(new FileInputStream(file));
             BufferedReader br = new BufferedReader(isr)) {
            long start = System.currentTimeMillis();
            while (br.read() != -1); 
            long end = System.currentTimeMillis();
            System.out.println("InputStreamReader (Buffered) Time: " + (end - start) + " ms");
        } catch (IOException e) { e.printStackTrace(); }
    }

    private static void createDummyFile(File file) {
        try (FileWriter fw = new FileWriter(file)) {
            for (int i = 0; i < 500000; i++) fw.write("Test Data ");
        } catch (IOException e) { e.printStackTrace(); }
    }
}