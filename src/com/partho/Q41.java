package com.partho;

import java.util.Arrays;

public class Q41 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 4};
        System.out.println(Arrays.toString(misMatch(arr)));
    }

    static int[] misMatch(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j + 1) {
                return new int[]{arr[j], j + 1};
            }
        }
        return new int[]{-1, -1};
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

/*
    Leetcode 645 ==> Set mismatch --> One is duplicate and one is repeated
*/