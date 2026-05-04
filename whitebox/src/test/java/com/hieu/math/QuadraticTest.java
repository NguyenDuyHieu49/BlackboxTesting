package com.hieu.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class QuadraticTest {
    @Test void testTwoRoots() {
        double[] r = Quadratic.solve(1, -3, 2); // x^2 -3x +2 =0 => 1 and 2
        assertEquals(2, r.length);
        assertTrue((r[0] == 2.0 && r[1] == 1.0) || (r[0] == 1.0 && r[1] == 2.0));
    }
    @Test void testDoubleRoot() {
        double[] r = Quadratic.solve(1, 2, 1); // (x+1)^2
        assertEquals(1, r.length);
        assertEquals(-1.0, r[0]);
    }
    @Test void testNoRealRoot() {
        double[] r = Quadratic.solve(1, 0, 1); // x^2 +1 =0
        assertEquals(0, r.length);
    }
    @Test void testAZeroThrows() {
        assertThrows(IllegalArgumentException.class, () -> Quadratic.solve(0, 2, 1));
    }
}
