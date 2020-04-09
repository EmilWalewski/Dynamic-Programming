package com.company;

import java.util.Scanner;

public class AddTwoNumbers {


    public static void solve(Scanner input) {

        int t = input.nextInt();

        while (t-- > 0){

            int a = input.nextInt();
            int b = input.nextInt();

            if (a >= 1 && a <= 10000 && b >= 1 && b <= 10000)
            System.out.println(a+b);
        }

    }
}
