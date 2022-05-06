package com.partho;

public class Q66 {
    public static void main(String[] args) {
        int[] arr = {4, 5, 6, 7, 0, 1, 2};
        System.out.println(findAns(arr));
//        int target = 0;
//        System.out.println(binarySearch(arr,target));
    }

    static int findAns(int[] arr) {
        int max = Integer.MAX_VALUE;
        for (int i = 0; i <= arr.length - 1; i++) {
            int ans = binarySearch(arr, arr[i]);
            if (ans < max) {
                max = ans;
            }
        }
        return max;
    }

    static int binarySearch(int[] arr, int target) {
        int s = 0;
        int e = arr.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            }
            if (arr[s] <= arr[m]) {
                if (target >= arr[s] && target <= arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (target >= arr[m] && target <= arr[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }
}
