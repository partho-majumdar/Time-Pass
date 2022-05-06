package com.partho;

public class Q10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        {
//            int a = 11; // this is not possible
            a = 13;
            System.out.println(a);

            int c = 30;
        }
        System.out.println(a);
        int c = 33;
        System.out.println(c);
    }
}

/*
    primitive ==> int, char, boolean, byte
*/
