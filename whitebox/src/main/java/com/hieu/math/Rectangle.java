package com.hieu.math;

public class Rectangle {
    public static int perimeter(int w, int h) {
        if (w < 0 || h < 0) throw new IllegalArgumentException("Width and height must be non-negative");
        return 2 * (w + h);
    }

    public static int area(int w, int h) {
        if (w < 0 || h < 0) throw new IllegalArgumentException("Width and height must be non-negative");
        return w * h;
    }
}
