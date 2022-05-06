package com.partho;

import java.util.Date;

public class Q6 {
    public static void main(String[] args) {
        Date date = new Date();
        int today = date.getDay();

        switch (today) {
            case 0 -> System.out.println("Today is Sunday");
            case 1 -> System.out.println("Today is Monday");
            case 2 -> System.out.println("Today is Tuesday");
            case 3 -> System.out.println("Today is Wednesday");
            case 4 -> System.out.println("Today is Thursday");
            case 5 -> System.out.println("Today is Friday");
            case 6 -> System.out.println("Today is Saturday");
        }
    }
}
