package com.hieu.math;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class MonthDaysTest {
    @Test void test31Days() { assertEquals(31, MonthDays.daysInMonth(1, 2021)); }
    @Test void test30Days() { assertEquals(30, MonthDays.daysInMonth(4, 2021)); }
    @Test void testFebNonLeap() { assertEquals(28, MonthDays.daysInMonth(2, 2019)); }
    @Test void testFebLeap() { assertEquals(29, MonthDays.daysInMonth(2, 2020)); }
    @Test void testInvalidMonth() { assertThrows(IllegalArgumentException.class, () -> MonthDays.daysInMonth(0, 2020)); }
    @Test void testInvalidYear() { assertThrows(IllegalArgumentException.class, () -> MonthDays.daysInMonth(1, 0)); }
}
