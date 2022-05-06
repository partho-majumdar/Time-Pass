package com.partho;

import java.util.Arrays;

public class Q46 {
    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9},
        };
        int target = 6;
        System.out.println(Arrays.toString(searchMatrix(matrix, target)));
    }

    static int[] searchMatrix(int[][] matrix, int target) {
        int r = 0;
        int c = matrix[0].length - 1;

        while (r < matrix.length && c >= 0) {
            if (matrix[r][c] == target) {
                return new int[]{r, c};
            }
            if (matrix[r][c] < target) {
                r++;
            } else if (matrix[r][c] > target) {
                c--;
            }
        }

        return new int[]{-1, -1};
    }
}

/*
    2d array ==> Search in a sorted matrix
*/