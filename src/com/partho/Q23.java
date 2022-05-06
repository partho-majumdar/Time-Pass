package com.partho;

public class Q23 {
    public static void main(String[] args) {
        int[] arr = {13, 12, 25, 91, 17, 16, 82};
        System.out.println(maxRange(arr, 4, 6));
    }

    static int maxRange(int[] arr, int start, int end) {

        int max = arr[start];
        for (int i = start; i <= end; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }
}
