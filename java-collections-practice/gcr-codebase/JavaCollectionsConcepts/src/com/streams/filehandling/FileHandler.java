package com.streams.filehandling;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileHandler {
	public void copyFile(String sourcePath, String destPath) {
		try (FileInputStream fis = new FileInputStream(sourcePath);
				FileOutputStream fos = new FileOutputStream(destPath)) {

			int byteData;
			while ((byteData = fis.read()) != -1) {
				fos.write(byteData);
			}
			System.out.println("File copied successfully!");
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
	}
}