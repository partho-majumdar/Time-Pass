package com.partho;

public class Q56 {
    public static void main(String[] args) {
        System.out.println(countOpe(3,2));
    }

    static int countOpe(int n1, int n2) {
        return helper(n1, n2, 0);
    }

    static int helper(int n1, int n2, int c) {
        if (n1 == 0 && n2 == 0) {
            return c;
        }
        if (n1 > n2) {
            return helper(n1 = n1 - n2, n2, c = c + 1);
        } else {
            return helper(n2 = n2 - n1, n1, c = c + 1);
        }
    }
}
