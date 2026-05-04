package com.hieu.math;

public class Quadratic {
    // Trả về mảng rỗng nếu vô nghiệm, mảng 1 phần tử nếu nghiệm kép, mảng 2 phần tử nếu 2 nghiệm
    public static double[] solve(double a, double b, double c) {
        if (a == 0) throw new IllegalArgumentException("Coefficient a must not be zero");
        double d = b * b - 4 * a * c;
        if (d < 0) return new double[0];
        if (d == 0) return new double[]{ -b / (2 * a) };
        double sqrt = Math.sqrt(d);
        double x1 = (-b + sqrt) / (2 * a);
        double x2 = (-b - sqrt) / (2 * a);
        return new double[]{ x1, x2 };
    }
}
