package com.junit.test;

import org.junit.jupiter.api.Test;
import com.junit.main.MathUtils;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    @Test
    void testDivideByZeroException() {
        MathUtils utils = new MathUtils();
        assertThrows(ArithmeticException.class, () -> utils.divide(10, 0));
    }
}