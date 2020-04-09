package com.company;

import java.util.Scanner;

public class ChiefPresence {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int a;
        int b;
        int c;

        while (t-- > 0){

            a = input.nextInt();
            b = input.nextInt();
            c = (a > b) ? a : b;

            System.out.println(c+" "+(a+b));

        }
    }
}
