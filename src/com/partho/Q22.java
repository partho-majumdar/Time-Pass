package com.partho;

import java.util.Arrays;

public class Q22 {
    public static void main(String[] args) {
        int[] arr = {4, 3, 24, 9, 7};
        System.out.println(maxNum(arr));
    }

    static int maxNum(int[] arr) {
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}

/*
    Maximum value from array
*/