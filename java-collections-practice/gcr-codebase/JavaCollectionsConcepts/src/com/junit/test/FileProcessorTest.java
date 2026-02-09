package com.junit.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;
import com.junit.main.FileProcessor;
import java.io.File;
import java.io.IOException;
import static org.junit.jupiter.api.Assertions.*;

public class FileProcessorTest {
	private final String TEST_FILE = "testfile.txt";
	private final FileProcessor processor = new FileProcessor();

	@Test
	void testWriteAndReadFile() throws IOException {
		String content = "Hello JUnit";
		processor.writeToFile(TEST_FILE, content);

		File file = new File(TEST_FILE);
		assertTrue(file.exists());

		String readContent = processor.readFromFile(TEST_FILE);
		assertEquals(content, readContent);
	}

	@Test
	void testReadNonExistentFile() {
		assertThrows(IOException.class, () -> processor.readFromFile("ghost.txt"));
	}

	@AfterEach
	void cleanup() {
		new File(TEST_FILE).delete();
	}
}