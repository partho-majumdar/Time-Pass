package com.partho;

public class Q54 {
    public static void main(String[] args) {
        System.out.println(countZero(fact(7)));
        System.out.println(fact(7));
    }

    static int fact(int n) {
        if (n <= 1) {
            return 1;
        }
        return n * fact(n - 1);
    }

    static int countZero(int fact) {
        return helper(fact, 0);
    }

    static int helper(int n, int c) {
        if (n == 0) {
            return c;
        }
        int rem = n % 10;
        if (rem == 0) {
            return helper(n / 10, c = c + 1);
        }
        return helper(n / 10, c);
    }
}
