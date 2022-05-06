package com.partho;

public class Q53 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 1};
        int target = 3;
        System.out.println(findAns(arr,target));
    }

    static int findAns(int[] arr, int target) {
        int peak = peakIndex(arr);
        int firstTry = binarySearch(arr, target, 0, peak);
        if (firstTry != -1) {
            return firstTry;
        }
        return binarySearch(arr, target, peak + 1, arr.length - 1);
    }

    static int peakIndex(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] > arr[mid + 1]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return start;
    }

    static int binarySearch(int[] arr, int target, int start, int end) {
        boolean isAsc = arr[start] < arr[end];
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }
            if (isAsc) {
                if (arr[mid] > target) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            } else {
                if (arr[mid] > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}
