package com.partho;

import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter your name ==> ");
        String nam = in.nextLine();
        String personalized = myGreet(nam);
        System.out.println(personalized);
    }

    static String myGreet(String name) {
        return "Hello " + name + "! " + "Ki obostha tomar?";
    }
}
