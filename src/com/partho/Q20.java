package com.partho;

import java.util.ArrayList;
import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(5);
        Scanner in = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            list.add(in.nextInt());
        }

        for (int i = 0; i < 6; i++) {
            System.out.println(list.get(i));
        }

        System.out.println(list);
    }
}
