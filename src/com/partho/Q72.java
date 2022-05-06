package com.partho;

public class Q72 {
    public static void main(String[] args) {
        skipA("", "baccad");
        System.out.println(skip2("baccad"));
    }

    static void skipA(String p, String up) {
        if (up.isEmpty()) {
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            skipA(p, up.substring(1));
        } else {
            skipA(p + ch, up.substring(1));
        }
    }

    static String skip2(String up) {
        if (up.isEmpty()) {
            return "";
        }
        char ch = up.charAt(0);
        if (ch == 'a') {
            return skip2(up.substring(1));
        } else {
            return ch + skip2(up.substring(1));
        }
    }
}























