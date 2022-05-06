package com.partho;

import java.util.Arrays;

public class Q12 {
    public static void main(String[] args) {
        mela(6, 9, "Kanu", "manu", "tanu");
        fun(2, 6, 4, 9, 1, 5);
    }

    static void mela(int a, int b, String... c) {
        System.out.println(Arrays.toString(c));
    }

    static void fun(int... v) {
        System.out.println(Arrays.toString(v));
    }
}

/*
    var-args
*/