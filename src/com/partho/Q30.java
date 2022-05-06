package com.partho;

public class Q30 {
    public static void main(String[] args) {
        int[][] arr2D = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int ans = array2D(arr2D);
        System.out.println(ans);
    }

    static int array2D(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] > max) {
                    max = arr[row][col];
                }
            }
        }
        return max;
    }
}

/*
    Max Value from 2d array (Linear Search)
*/
