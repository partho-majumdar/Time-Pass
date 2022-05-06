package com.partho;

import java.util.Arrays;

public class Q49 {
    public static void main(String[] args) {
        int[] arr = {5, 7, 7, 8, 8, 10};
        int target = 7;
        System.out.println(Arrays.toString(findAns(arr, target)));
    }

    static int[] findAns(int[] arr, int target) {
        int[] ans = {-1, -1};
        int s = bs(arr, target, true);
        int e = bs(arr, target, false);
        ans[0] = s;
        ans[1] = e;
        return ans;
    }

    static int bs(int[] arr, int target, boolean firstIndex) {
        int s = 0;
        int e = arr.length - 1;
        int ans = -1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] > target) {
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                ans = m;
                if (firstIndex) {
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
    find first and last position of an element
 */