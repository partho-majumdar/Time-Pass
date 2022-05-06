package com.partho;

public class Q37 {
    public static void main(String[] args) {
        int[] arr = {4, 0, 2, 3};
        System.out.println(missingNum(arr));
    }

    static int missingNum(int[] arr) {
        int i = 0;
        while (i < arr.length) {
            int correct = arr[i];
            if (arr[i] < arr.length && arr[i] != arr[correct]) {
                swap(arr, i, correct);
            } else {
                i++;
            }
        }
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != j) {
                return j;
            }
        }
        return arr.length;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}

/*
    Leetcode 268 ==> Missing numbers
*/