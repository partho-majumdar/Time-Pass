package com.partho;

public class Q13 {
    public static void main(String[] args) {
        int ans1 = sum(6, 9);
        System.out.println(ans1);

        String ans2 = sum("Jhinku", "juicy");
        System.out.println(ans2);
    }

    static int sum(int a, int b) {
        return a + b;
    }

    static String sum(String x, String y) {
        return x + " " + y;
    }
}

/*
    function-overloading
*/