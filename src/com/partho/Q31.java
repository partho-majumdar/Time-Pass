package com.partho;

public class Q31 {
    public static void main(String[] args) {
        int[] arr = {12, 345, 2, 6, 7896};
        int ans = evenNumDigit(arr);
        System.out.println(ans);
    }

    static int evenNumDigit(int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isEven(arr[i])) {
                count++;
            }
        }
        return count;
    }

    static boolean isEven(int num) {
        int evenDigit = findDigit(num);
        return evenDigit % 2 == 0;
    }

    static int findDigit(int num) {
        int count = 0;
        if (num < 0) {
            num = num * -1;
        }
        if (num == 0) {
            return -1;
        }
        while (num > 0) {
            num = num / 10;
            count++;
        }
        return count;
    }
}
/*
    Find numbers with even number of digit (Linear Search)
*/