package com.partho;

public class Q25 {
    public static void main(String[] args) {
        int[] arr = {23, 5, 1, 2, 8, 19, -3, 16};
        int target = 19;
        int ans = linearSearch(arr, target);
        System.out.println(ans);
    }

    static int linearSearch(int[] arr, int target) {
        if (arr.length == 0) {
            return -1;
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}

/*
    Linear search basic
*/
