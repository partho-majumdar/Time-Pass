package com.partho;

import java.util.Arrays;
import java.util.Scanner;

public class Q17 {
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner in = new Scanner(System.in);
        System.out.print("Enter 4 number ==> ");

        for (int i = 0; i < arr.length; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(Arrays.toString(arr));
    }
}

/*
    Take input from user and print this
*/
