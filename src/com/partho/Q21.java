package com.partho;

import java.util.Arrays;

public class Q21 {
    public static void main(String[] args) {
        int[] arr = {6, 9, 7, 5, 4};
        swap(arr, 0, 4);
        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}

/*
    Swap array two index number
*/