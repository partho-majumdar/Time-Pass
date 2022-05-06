package com.partho;

public class Q44 {
    public static void main(String[] args) {
        int[] arr = {1,0,1,1,1};
        int target = 0;
        System.out.println(binarySearch(arr,target));
    }

    static boolean binarySearch(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;

        boolean isAsc = nums[s] < nums[e];

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                return true;
            }
            if (isAsc) {
                if (nums[m] > target) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (nums[m] < target) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
        }
        return false;
    }
}
