package com.hieu.math;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

class FactorialUtilTest {

    @Test
    void testFactorialZero() {
        assertEquals(BigInteger.ONE, FactorialUtil.factorial(0));
    }

    @Test
    void testFactorialSmallValues() {
        assertEquals(BigInteger.ONE, FactorialUtil.factorial(1));   // 1! = 1
        assertEquals(new BigInteger("2"), FactorialUtil.factorial(2)); // 2! = 2
        assertEquals(new BigInteger("6"), FactorialUtil.factorial(3)); // 3! = 6
        assertEquals(new BigInteger("24"), FactorialUtil.factorial(4)); // 4! = 24
        assertEquals(new BigInteger("120"), FactorialUtil.factorial(5)); // 5! = 120
    }

    @Test
    void testFactorialLargeValue() {
        // 20! = 2432902008176640000
        assertEquals(new BigInteger("2432902008176640000"), FactorialUtil.factorial(20));
    }

    @Test
    void testNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> FactorialUtil.factorial(-1));
        assertThrows(IllegalArgumentException.class, () -> FactorialUtil.factorial(-10));
    }
}
