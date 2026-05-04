package com.hieu.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PrimeCheckTest {
    @Test void testSmallPrimes() {
        assertFalse(PrimeCheck.isPrime(0));
        assertFalse(PrimeCheck.isPrime(1));
        assertTrue(PrimeCheck.isPrime(2));
        assertTrue(PrimeCheck.isPrime(3));
    }
    @Test void testComposite() {
        assertFalse(PrimeCheck.isPrime(4));
        assertFalse(PrimeCheck.isPrime(9));
        assertTrue(PrimeCheck.isPrime(97));
    }
}
