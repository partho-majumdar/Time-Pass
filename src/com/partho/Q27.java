package com.partho;

public class Q27 {
    public static void main(String[] args) {
        int[] arr = {18, 12, -7, 3, 14, 28};
        int target = 3;
        int ans = linearSearch(arr, 1, 4, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int start, int end, int target) {
        if (arr.length == 0) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

/*
    Linear search in string
*/
