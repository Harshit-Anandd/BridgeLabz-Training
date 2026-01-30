package com.exceptions.autoclosing;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Resource {
	public void readFirstLine(String fileName) {
		try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
			String line = br.readLine();
			System.out.println("First Line: " + line);
		} catch (IOException e) {
			System.out.println("Error reading file");
		}
	}
}