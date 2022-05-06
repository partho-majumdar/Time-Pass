package com.partho;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number ==> ");
        int num = in.nextInt();
        int first = 0;
        int second = 1;
        int sum;
        System.out.print(first + " " + second);

        for (int i = 3; i <= num; i++) {
            sum = first + second;
            System.out.print(" " + sum);
            first = second;
            second = sum;
        }
    }
}

/*
    Fibo series
    0, 1, 1, 2, 3, 5, 8, 13........
*/
