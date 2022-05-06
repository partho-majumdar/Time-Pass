package com.partho;

import java.util.Arrays;

public class Q70 {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        System.out.println(Arrays.toString(mergeSort(arr)));
    }

    static int[] mergeSort(int[] arr) {
        if (arr.length == 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = mergeSort(Arrays.copyOfRange(arr, 0, mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr, mid, arr.length));
        return merge(left, right);
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] mix = new int[arr1.length + arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                mix[k] = arr1[i];
                i++;
            } else {
                mix[k] = arr2[j];
                j++;
            }
            k++;
        }
        while (i < arr1.length) {
            mix[k] = arr1[i];
            i++;
            k++;
        }
        while (j < arr2.length) {
            mix[k] = arr1[j];
            j++;
            k++;
        }
        return mix;
    }
}
