package com.junit.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.junit.main.ListManager;
import static org.junit.jupiter.api.Assertions.*;

public class ListManagerTest {
	private ListManager manager;

	@BeforeEach
	void setUp() {
		manager = new ListManager();
	}

	@Test
	void testAddElement() {
		manager.addElement(10);
		assertEquals(1, manager.getSize());
		assertTrue(manager.getList().contains(10));
	}

	@Test
	void testRemoveElement() {
		manager.addElement(20);
		manager.removeElement(20);
		assertEquals(0, manager.getSize());
	}

	@Test
	void testGetSize() {
		manager.addElement(1);
		manager.addElement(2);
		assertEquals(2, manager.getSize());
	}
}