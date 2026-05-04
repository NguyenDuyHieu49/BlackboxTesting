package com.hieu.math;

public class AlternatingSum {
    // S = 1 - 2 + 3 - 4 + ... + n
    public static int compute(int n) {
        if (n <= 0) throw new IllegalArgumentException("n must be positive");
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (i % 2 == 1) ? i : -i;
        }
        return sum;
    }
}
