package com.streams.filterstreams;
import java.io.*;

public class TextCaseProcessor {
	public void convertToLowercase(String src, String dest) {
		try (BufferedReader br = new BufferedReader(new FileReader(src));
				BufferedWriter bw = new BufferedWriter(new FileWriter(dest))) {

			int c;
			while ((c = br.read()) != -1) {
				if (Character.isUpperCase(c)) {
					bw.write(Character.toLowerCase(c));
				} else {
					bw.write(c);
				}
			}
			System.out.println("File converted and saved to " + dest);
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}