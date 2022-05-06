package com.partho;

public class Q64 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(findAns(arr, target));
    }

    static int findAns(int[] arr, int target) {
        int peak = findPeak(arr);
        int firstTry = orderAgnostic(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return orderAgnostic(arr, target, peak + 1, arr.length - 1);
    }

    static int findPeak(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1]) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }

    static int orderAgnostic(int[] arr, int target, int s, int e) {
        boolean isAsc = arr[s] < arr[e];
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] == target) {
                return m;
            }
            if (isAsc) {
                if (target > arr[m]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            } else {
                if (target > arr[m]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return -1;
    }
}

/*
    find in mountain array
 */