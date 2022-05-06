package com.partho;

public class Q51 {
    public static void main(String[] args) {
        int[] arr = {3, 5, 7, 9, 10, 90, 100, 130, 140, 160, 170};
        int target = 10;
        System.out.println(findAns(arr, target));
    }

    static int findAns(int[] arr, int target) {
        int s = 0;
        int e = 1;

        while (target > arr[e]) {
            int temp = e + 1;
            e = e + (e - s + 1);
            s = temp;
        }
        return bs(arr, target, s, e);
    }

    static int bs(int[] arr, int target, int s, int e) {

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            } else if (arr[m] > target) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }
}

/*
    https://www.geeksforgeeks.org/find-position-element-sorted-array-infinite-numbers/
 */