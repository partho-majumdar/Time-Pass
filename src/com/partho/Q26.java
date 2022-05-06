package com.partho;

public class Q26 {
    public static void main(String[] args) {
        String name = "kunal";
        char target = 'u';
        boolean ans = linearSearch(name,target);
        System.out.println(ans);
    }

    static boolean linearSearch(String str, char target) {
        if (str.length() == 0) {
            return false;
        }
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return true;
            }
        }
        return false;
    }
}
