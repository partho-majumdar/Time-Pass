package com.partho;

import java.util.Arrays;

public class Q28 {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        System.out.println(minValue(arr));
    }

    static int minValue(int[] arr) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }
}

/*
    Minimum value (Linear Search)
*/