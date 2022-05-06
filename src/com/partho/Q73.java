package com.partho;

public class Q73 {
    public static void main(String[] args) {
        System.out.println(skipApple("baccapplede"));
        System.out.println(skipApp("bacappcde"));
        System.out.println(skipApp("bacapplecde2"));

    }

    static String skipApple(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("apple")) {
            return skipApple(up.substring(5));
        } else {
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    static String skipApp(String up) {
        if (up.isEmpty()) {
            return "";
        }
        if (up.startsWith("app") && !up.startsWith("apple")) {
            return skipApp(up.substring(3));
        } else {
            return up.charAt(0) + skipApp(up.substring(1));
        }
    }
}
