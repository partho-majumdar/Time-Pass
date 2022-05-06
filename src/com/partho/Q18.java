package com.partho;

import java.util.Arrays;
import java.util.Scanner;

public class Q18 {
    public static void main(String[] args) {
        int[][] arr2D = new int[3][3];
        Scanner in = new Scanner(System.in);

        for (int row = 0; row < arr2D.length; row++) {
            for (int col = 0; col < arr2D[row].length; col++) {
                arr2D[row][col] = in.nextInt();
            }
        }

        for (int[] a : arr2D) {
            System.out.println(Arrays.toString(a));
        }
    }
}

/*
    Take input from 2D array and print this
*/

