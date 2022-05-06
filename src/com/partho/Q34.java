package com.partho;

import java.util.Arrays;

public class Q34 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        selection(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selection(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int getMax = maxIndex(arr, 0, last);
            swap(arr, getMax, last);
        }
    }

    static int maxIndex(int[] arr, int start, int end) {
        int max = start;
        for (int i = start; i <= end; i++) {
            if (arr[i] > arr[max]) {
                max = i;
            }
        }
        return max;
    }

    static void swap(int[] arr, int start, int end) {
        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }
}

/*
    Selection sort ==> Select an element and put it at its right index
*/