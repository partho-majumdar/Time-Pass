package com.partho;

public class Q16 {
    public static void main(String[] args) {

        for (int i = 100; i < 1000; i++) {
            if (isArmstrong(i)) {
                System.out.print(i + " ");
            }
        }
    }

    static boolean isArmstrong(int n) {

        int original = n;
        int sum = 0;

        while (n > 0) {
            int rem = n % 10;
            n = n / 10;
            sum = sum + (rem * rem * rem);
        }
        return sum == original;
    }
}

/*
    print all armstrong number during 100 - 1000
*/
