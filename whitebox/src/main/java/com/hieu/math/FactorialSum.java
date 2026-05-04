package com.hieu.math;

import java.math.BigInteger;

public class FactorialSum {
    // S = 1! + 2! + ... + n!
    public static BigInteger sumFactorials(int n) {
        if (n < 0) throw new IllegalArgumentException("n must be non-negative");
        BigInteger sum = BigInteger.ZERO;
        BigInteger fact = BigInteger.ONE;
        for (int i = 1; i <= n; i++) {
            fact = fact.multiply(BigInteger.valueOf(i));
            sum = sum.add(fact);
        }
        return sum;
    }
}

