package com.junit.test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.junit.main.DatabaseConnection;

public class DatabaseConnectionTest {
	private DatabaseConnection db;

	@BeforeEach
	void init() {
		db = new DatabaseConnection();
		db.connect();
	}

	@AfterEach
	void tearDown() {
		db.disconnect();
	}

	@Test
	void testExecuteQuery() {
		System.out.println("Executing SQL Query...");
		// Assertions would go here for real logic
	}
}