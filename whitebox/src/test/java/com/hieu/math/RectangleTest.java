package com.hieu.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class RectangleTest {
    @Test void testPerimeterNormal() {
        assertEquals(10, Rectangle.perimeter(2,3));
    }
    @Test void testAreaNormal() {
        assertEquals(6, Rectangle.area(2,3));
    }
    @Test void testNegativeThrows() {
        assertThrows(IllegalArgumentException.class, () -> Rectangle.area(-1,2));
        assertThrows(IllegalArgumentException.class, () -> Rectangle.perimeter(1,-2));
    }
}
