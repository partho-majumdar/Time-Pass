package com.partho;

public class Q32 {
    public static void main(String[] args) {
        int[][] accounts = {
                {1, 5},
                {7, 3},
                {3, 5}
        };
        int ans = richCustomer(accounts);
        System.out.println((ans));
    }

    static int richCustomer(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int row = 0; row < arr.length; row++) {
            int sum = 0;
            for (int col = 0; col < arr[row].length; col++) {
                sum += arr[row][col];
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }
}

/*
    Richest customer wealth (Linear Search) ==> Sum of every column
*/