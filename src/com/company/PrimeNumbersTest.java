package com.company;

import java.util.Scanner;

public class PrimeNumbersTest {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n = 0;

        while (t-- > 0){

            n = input.nextInt();

            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0)
                System.out.println("no");
            else
                System.out.println("yes");

        }
    }
}
