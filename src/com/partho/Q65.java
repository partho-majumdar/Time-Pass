package com.partho;

public class Q65 {
    public static void main(String[] args) {
        int[] arr = {3, 4, 5, 6, 7, 0, 1, 2};
        System.out.println(findPivot(arr));
    }

    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (m < e && arr[m] > arr[m + 1]) {
                return arr[m];
            }
            if (m > s && arr[m] < arr[m + 1]) {
                return arr[m + 1];
            }
            if (arr[m] > arr[s]) {
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return -1;
    }
}
