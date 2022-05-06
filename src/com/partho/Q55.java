package com.partho;

public class Q55 {
    public static void main(String[] args) {
        System.out.println(findSteps(14));
    }

    static int findSteps(int n) {
        return helper(n, 0);
    }

    static int helper(int n, int c) {

        if (n == 0) {
            return c;
        }
        if (n % 2 == 0) {
            return helper(n / 2, c = c + 1);
        }
        return helper(n - 1, c = c + 1);
    }
}
