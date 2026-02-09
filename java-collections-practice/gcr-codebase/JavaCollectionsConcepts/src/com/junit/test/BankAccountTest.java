package com.junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.junit.main.BankAccount;
import static org.junit.jupiter.api.Assertions.*;

public class BankAccountTest {
	private BankAccount account;

	@BeforeEach
	void setUp() {
		account = new BankAccount();
	}

	@Test
	void testDeposit() {
		account.deposit(100);
		assertEquals(100, account.getBalance());
	}

	@Test
	void testWithdraw() {
		account.deposit(100);
		account.withdraw(50);
		assertEquals(50, account.getBalance());
	}

	@Test
	void testInsufficientFunds() {
		account.deposit(50);
		assertThrows(IllegalArgumentException.class, () -> account.withdraw(100));
	}
}