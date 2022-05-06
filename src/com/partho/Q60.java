package com.partho;

public class Q60 {
    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 6, 7, 8, 9, 10};
        System.out.println(findAns(arr, 6));
    }

    static int findAns(int[] arr, int target) {
        int s = 0;
        int e = 1;
        while (target > arr[e]) {
//            int temp = e + 1;
//            e = e + (e - s + 1) * 2;
//            s = temp;
            s = e;
            e = s * 2;
        }
        return binarySearch(arr, target, s, e);
    }

    static int binarySearch(int[] arr, int target, int s, int e) {
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] > target) {
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            } else {
                return m;
            }
        }
        return -1;
    }
}

/*
    find element form infinite sorted array
 */