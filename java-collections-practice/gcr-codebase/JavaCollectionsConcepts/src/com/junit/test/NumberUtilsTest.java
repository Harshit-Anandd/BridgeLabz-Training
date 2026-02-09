package com.junit.test;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import com.junit.main.NumberUtils;
import static org.junit.jupiter.api.Assertions.*;

public class NumberUtilsTest {
	@ParameterizedTest
	@ValueSource(ints = {2, 4, 6, 8, 10})
	void testIsEven(int number) {
		NumberUtils utils = new NumberUtils();
		assertTrue(utils.isEven(number));
	}

	@ParameterizedTest
	@ValueSource(ints = {1, 3, 7, 9})
	void testIsOdd(int number) {
		NumberUtils utils = new NumberUtils();
		assertFalse(utils.isEven(number));
	}
}