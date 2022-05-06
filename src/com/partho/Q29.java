package com.partho;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Q29 {
    public static void main(String[] args) {
        int[][] arr2D = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 34;
        int[] ans = array2D(arr2D, target);
        System.out.println(Arrays.toString(ans));
    }

    static int[] array2D(int[][] arr, int target) {

        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }

        return new int[]{-1, -1};
    }
}

/*
    Search in 2D array (Linear Search)
*/