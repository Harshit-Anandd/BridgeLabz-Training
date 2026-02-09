package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.main.StringUtils;
import static org.junit.jupiter.api.Assertions.*;

public class StringUtilsTest {
	private final StringUtils utils = new StringUtils();

	@Test
	void testReverse() {
		assertEquals("cba", utils.reverse("abc"));
	}

	@Test
	void testIsPalindrome() {
		assertTrue(utils.isPalindrome("madam"));
		assertFalse(utils.isPalindrome("hello"));
	}

	@Test
	void testToUpperCase() {
		assertEquals("JAVA", utils.toUpperCase("java"));
	}
}