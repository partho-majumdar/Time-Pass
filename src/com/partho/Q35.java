package com.partho;

import java.util.Arrays;

public class Q35 {
    public static void main(String[] args) {
        int[] arr = {3, 1, 5, 4, 2};
        insertion(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 1; j <= arr.length - 1; j++) {
                if (arr[j] < arr[j - 1]) {
                    swap(arr, j, j - 1);
                }
                else {
                    break;
                }
            }
        }
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

/*
    Insertion sort ==> First part of the element is getting sorted
*/