package com.hieu.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AlternatingSumTest {
    @Test void testN1() { assertEquals(1, AlternatingSum.compute(1)); }
    @Test void testN2() { assertEquals(-1, AlternatingSum.compute(2)); }
    @Test void testN3() { assertEquals(2, AlternatingSum.compute(3)); }
    @Test void testInvalid() { assertThrows(IllegalArgumentException.class, () -> AlternatingSum.compute(0)); }
}
