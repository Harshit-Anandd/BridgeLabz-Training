package com.exceptions.filecheck;
import java.io.FileReader;
import java.io.IOException;

public class FileCheck {
	public void readFile(String fileName) {
		try (FileReader fr = new FileReader(fileName)) {
			int i;
			System.out.println("File Content:");
			while ((i = fr.read()) != -1) {
				System.out.print((char) i);
			}
			System.out.println(); // New line after content
		} catch (IOException e) {
			System.out.println("File not found");
		}
	}
}