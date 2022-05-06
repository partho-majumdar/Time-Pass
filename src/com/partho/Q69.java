package com.partho;

public class Q69 {
    public static void main(String[] args) {
        int num = 40;
        sqrt(40);
        System.out.println(sqrt(num));
    }

    static double sqrt(double n) {
        double x = n;
        double root;
        while (true) {
            root = 0.5 * (x + n / x);
            if (Math.abs(root - x) < 0.5) {
                break;
            }
            x = root;
        }
        return root;
    }
}
