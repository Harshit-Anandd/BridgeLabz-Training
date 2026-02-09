package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.main.DateFormatter;
import static org.junit.jupiter.api.Assertions.*;

public class DateFormatterTest {
	private final DateFormatter formatter = new DateFormatter();

	@Test
	void testValidDate() {
		assertEquals("31-12-2023", formatter.formatDate("2023-12-31"));
	}

	@Test
	void testInvalidDate() {
		assertThrows(IllegalArgumentException.class, () -> formatter.formatDate("31-12-2023"));
	}
}