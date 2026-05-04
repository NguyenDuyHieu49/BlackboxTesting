package com.hieu.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class GCDTest {
    @Test void testNormal() { assertEquals(6, GCD.gcd(54, 24)); }
    @Test void testNegativeInputs() { assertEquals(6, GCD.gcd(-54, 24)); }
    @Test void testOneZero() { assertEquals(5, GCD.gcd(0, 5)); }
    @Test void testBothZeroThrows() { assertThrows(IllegalArgumentException.class, () -> GCD.gcd(0,0)); }
}
