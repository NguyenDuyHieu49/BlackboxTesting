package com.hieu.math;

public class MonthDays {
    public static int daysInMonth(int month, int year) {
        if (month < 1 || month > 12) throw new IllegalArgumentException("Month must be 1..12");
        if (year <= 0) throw new IllegalArgumentException("Year must be positive");
        switch (month) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                return isLeapYear(year) ? 29 : 28;
            default:
                throw new IllegalArgumentException("Invalid month");
        }
    }

    public static boolean isLeapYear(int year) {
        if (year % 400 == 0) return true;
        if (year % 100 == 0) return false;
        return year % 4 == 0;
    }
}
