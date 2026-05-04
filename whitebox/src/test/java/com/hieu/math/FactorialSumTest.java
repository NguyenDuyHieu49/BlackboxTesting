package com.hieu.math;

import org.junit.jupiter.api.Test;
import java.math.BigInteger;
import static org.junit.jupiter.api.Assertions.*;

class FactorialSumTest {
    @Test void testSumSmall() {
        assertEquals(new BigInteger("1"), FactorialSum.sumFactorials(1));
        assertEquals(new BigInteger("3"), FactorialSum.sumFactorials(2)); // 1! + 2! = 3
        assertEquals(new BigInteger("9"), FactorialSum.sumFactorials(3)); // 1+2+6=9
    }
    @Test void testZero() {
        assertEquals(BigInteger.ZERO, FactorialSum.sumFactorials(0));
    }
    @Test void testNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> FactorialSum.sumFactorials(-1));
    }
}
