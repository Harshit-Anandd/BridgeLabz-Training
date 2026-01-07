package com.bridgelabz.readers.inputstreamreader.bytetocharacter;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

public class ByteToCharStream {
    public static void main(String[] args) {
        String filePath = "src/com/bridgelabz/readers/inputstreamreader/bytetocharacter/sample.txt"; // File with specific encoding

        try (
            FileInputStream fis = new FileInputStream(filePath);
            // Specify encoding (UTF-8)
            InputStreamReader isr = new InputStreamReader(fis, StandardCharsets.UTF_8);
            BufferedReader br = new BufferedReader(isr)
        ) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}