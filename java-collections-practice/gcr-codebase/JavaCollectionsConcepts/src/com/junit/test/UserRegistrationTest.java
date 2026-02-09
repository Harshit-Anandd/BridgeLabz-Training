package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.main.UserRegistration;
import static org.junit.jupiter.api.Assertions.*;

public class UserRegistrationTest {
	private final UserRegistration registration = new UserRegistration();

	@Test
	void testValidRegistration() {
		assertTrue(registration.registerUser("john_doe", "john@example.com", "secure123"));
	}

	@Test
	void testInvalidUsername() {
		assertThrows(IllegalArgumentException.class, 
				() -> registration.registerUser("", "email@test.com", "pass123"));
	}

	@Test
	void testInvalidEmail() {
		assertThrows(IllegalArgumentException.class, 
				() -> registration.registerUser("user", "invalid-email", "pass123"));
	}
}