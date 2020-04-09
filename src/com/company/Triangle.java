package com.company;

import java.util.Scanner;

public class Triangle {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int a;
        int b;
        int c;

        while (t-- > 0){

            a = input.nextInt();
            b = input.nextInt();
            c = input.nextInt();

            if (a + b + c == 180)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
