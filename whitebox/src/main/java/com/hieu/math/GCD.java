package com.hieu.math;

public class GCD {
    public static int gcd(int a, int b) {
        if (a == 0 && b == 0) throw new IllegalArgumentException("At least one number must be non-zero");
        a = Math.abs(a);
        b = Math.abs(b);
        while (b != 0) {
            int t = a % b;
            a = b;
            b = t;
        }
        return a;
    }
}
