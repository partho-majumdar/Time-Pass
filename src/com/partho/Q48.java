package com.partho;

public class Q48 {
    public static void main(String[] args) {
        char[] arr = {'c', 'f', 'j'};
        char target = 'a';
        System.out.println(findSmall(arr, target));
    }

    static char findSmall(char[] arr, char target) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;

            if (arr[m] > target) {
                e = m - 1;
            } else if (arr[m] < target) {
                s = m + 1;
            }
        }
        return arr[s % arr.length];
    }
}

/*
    find ceiling of a number
 */