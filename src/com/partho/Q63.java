package com.partho;

public class Q63 {
    public static void main(String[] args) {
        System.out.println(rev(1534236469));
    }

    static int rev(int num) {
        int ans = 0;
        while (num != 0) {
            int rem = num % 10;
            num = num / 10;
            ans = (ans * 10) + rem;
        }
        return ans;
    }
}
