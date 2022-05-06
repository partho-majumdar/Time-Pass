package com.partho;

import java.util.Scanner;

public class Q1 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter any number ==> ");
        int num = in.nextInt();
        int a = 0;
        int b = 1;
        int count = 2;

        while (count <= num) {
            int temp = b;
            b = a + b;
            a = temp;
            count++;
        }
        System.out.println(b);
    }
}

/*
    Nth fibo number
    0, 1, 1, 2, 3, 5, 8, 13......
    0  1  2  3  4  5  6  7.......
*/
