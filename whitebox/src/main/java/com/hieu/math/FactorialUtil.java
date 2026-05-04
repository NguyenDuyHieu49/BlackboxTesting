package com.hieu.math;

import java.math.BigInteger;

public class FactorialUtil {
    public static BigInteger factorial(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        BigInteger res = BigInteger.ONE;
        for (int i = 2; i <= n; i++) res = res.multiply(BigInteger.valueOf(i));
        return res;
    }
}
