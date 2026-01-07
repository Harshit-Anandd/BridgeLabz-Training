package com.bridgelabz.readers.inputstreamreader.consoletofile;

import java.io.BufferedReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ConsoleToFile {
    public static void main(String[] args) {
        String outputFile = "src/com/bridgelabz/readers/inputstreamreader/consoletofile/sample.txt";

        try (
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            PrintWriter writer = new PrintWriter(new FileWriter(outputFile))
        ) {
            System.out.println("Enter text (type 'exit' to stop):");
            String line;
            while (true) {
                line = reader.readLine();
                if ("exit".equalsIgnoreCase(line)) break;
                writer.println(line);
            }
            System.out.println("Data written to " + outputFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}