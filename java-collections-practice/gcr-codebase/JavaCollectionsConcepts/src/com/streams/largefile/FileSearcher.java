package com.streams.largefile;
import java.io.*;

public class FileSearcher {
    public void searchErrorLines(String path) {
        try (BufferedReader br = new BufferedReader(new FileReader(path))) {
            String line;
            System.out.println("--- Lines containing 'error' ---");
            while ((line = br.readLine()) != null) {
                if (line.toLowerCase().contains("error")) {
                    System.out.println(line);
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }
}