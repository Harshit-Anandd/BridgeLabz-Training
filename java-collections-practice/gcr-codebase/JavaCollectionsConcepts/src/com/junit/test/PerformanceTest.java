package com.junit.test;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;
import com.junit.main.PerformanceUtils;
import java.util.concurrent.TimeUnit;
import static org.junit.jupiter.api.Assertions.*;

public class PerformanceTest {

	@Test
	@Timeout(value = 2, unit = TimeUnit.SECONDS)
	void testLongRunningTask() {
		PerformanceUtils utils = new PerformanceUtils();
		// This test is expected to fail because 3s > 2s
		assertEquals(1, utils.longRunningTask());
	}
}