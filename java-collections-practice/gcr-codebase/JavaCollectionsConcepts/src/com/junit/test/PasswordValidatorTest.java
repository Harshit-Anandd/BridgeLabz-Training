package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.main.PasswordValidator;
import static org.junit.jupiter.api.Assertions.*;

public class PasswordValidatorTest {
	private final PasswordValidator validator = new PasswordValidator();

	@Test
	void testValidPassword() {
		assertTrue(validator.isValid("Password123"));
	}

	@Test
	void testTooShort() {
		assertFalse(validator.isValid("Pass1"));
	}

	@Test
	void testNoDigit() {
		assertFalse(validator.isValid("Password"));
	}

	@Test
	void testNoUpperCase() {
		assertFalse(validator.isValid("password123"));
	}
}