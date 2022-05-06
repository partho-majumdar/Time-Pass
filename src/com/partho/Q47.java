package com.partho;

public class Q47 {
    public static void main(String[] args) {
        int[] num = {2, 5, 9, 6, 9, 3, 8, 9, 7, 1};
        System.out.println((dup2(num)));
    }

    static int dup2(int[] nums) {
        int i = 0;
        while (i < nums.length) {
            int correct = nums[i] - 1;
            if (nums[i] != nums[correct]) {
                swap(nums, correct, i);
            } else {
                i++;
            }
        }
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] != j + 1) {
                return nums[j];
            }
        }
        return -1;
    }

    static void swap(int[] arr, int index1, int index2) {
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
