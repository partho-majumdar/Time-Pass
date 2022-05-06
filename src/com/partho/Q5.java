package com.partho;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ans = 0;

        while (true) {
            System.out.print("Enter any operator ==> ");
            char op = in.next().charAt(0);

            if (op == '+' || op == '-' || op == '*' || op == '/' || op == '%') {
                System.out.print("Enter any two number ==> ");
                int num1 = in.nextInt();
                int num2 = in.nextInt();

                if (op == '+') {
                    ans = num1 + num2;
                }

                if (op == '-') {
                    ans = num1 - num2;
                }

                if (op == '*') {
                    ans = num1 * num2;
                }

                if (op == '/') {
                    if (num2 > num1) {
                        break;
                    }
                    ans = num1 / num2;
                }

                if (op == '%') {
                    if (num2 > num1) {
                        break;
                    }
                    ans = num1 % num2;
                }
            }
            else if (op == 'x' || op == 'X') {
                break;
            }
            else {
                System.out.println("Invalid Operator");
            }
            System.out.println(ans);
        }


    }
}

/*
    Calculator program
*/