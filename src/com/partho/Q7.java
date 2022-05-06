package com.partho;

import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter two number ==> ");
        int n1 = in.nextInt();
        int n2 = in.nextInt();
        int ans = sum(n1, n2);
        System.out.println(ans);
    }

    static int sum(int num1, int num2) {
        return num1 + num2;
    }
}
