package com.partho;

import java.util.Arrays;

public class Q59 {
    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 7, 7, 8, 8, 9, 10};
        System.out.println(Arrays.toString(findAns(arr, 7)));
    }

    static int[] findAns(int[] arr, int target) {
        int[] ans = {-1, -1};
        int first = binarySearch(arr, target, true);
        int last = binarySearch(arr, target, false);
        ans[1] = last;
        ans[0] = first;
        return ans;
    }

    static int binarySearch(int[] arr, int target, boolean findFirstIndex) {
        int ans = -1;
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] < target) {
                s = m + 1;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                ans = m;
                if (findFirstIndex) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return ans;
    }

}

/*
    find first and last element of array
 */