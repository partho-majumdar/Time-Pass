package com.partho;

public class Q9 {
    public static void main(String[] args) {
        int a = 9;
        int b = 6;
        swap(a, b);
        System.out.println(a + "" + b);
    }

    static void swap(int a1, int b1) {
        int temp = a1;
        a1 = b1;
        b1 = temp;
    }
}

/*
    Swap two number ==> no swap cause scope
*/
