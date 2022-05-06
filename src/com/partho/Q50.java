package com.partho;

public class Q50 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        System.out.println(appearOnce(arr));
    }

    static int appearOnce(int[] nums) {
        int unique = 0;
        for (int i = 0; i <= nums.length - 1; i++) {
            unique = unique ^ nums[i];
        }
        return unique;
    }
}
