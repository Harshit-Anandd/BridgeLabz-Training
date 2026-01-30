package com.streams.bytearray;
import java.io.*;

public class ImageHandler {
	public void processImage(String src, String dest) {
		try {
			// Read
			FileInputStream fis = new FileInputStream(src);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			byte[] buffer = new byte[1024];
			int read;
			while ((read = fis.read(buffer)) != -1) {
				baos.write(buffer, 0, read);
			}
			byte[] imageBytes = baos.toByteArray();
			fis.close();

			// Write
			ByteArrayInputStream bais = new ByteArrayInputStream(imageBytes);
			FileOutputStream fos = new FileOutputStream(dest);
			while ((read = bais.read(buffer)) != -1) {
				fos.write(buffer, 0, read);
			}
			fos.close();
			System.out.println("Image converted to byte array and restored successfully.");

		} catch (IOException e) {
			System.out.println("Error processing image: " + e.getMessage());
		}
	}
}