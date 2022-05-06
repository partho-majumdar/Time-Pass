package com.partho;

import java.util.ArrayList;

public class Q19 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);

        list.set(3,33);

        System.out.println(list.get(3));

        System.out.println(list);
    }
}

/*
    Arraylist
*/