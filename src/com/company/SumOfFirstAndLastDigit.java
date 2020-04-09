package com.company;

import java.util.Scanner;

public class SumOfFirstAndLastDigit {

    public static void solve(Scanner input) {

        int t = input.nextInt();

        while (t-- > 0){

            int n = input.nextInt();

            int first = 0;
            int last = n % 10;

            while (n > 0){

                first = n % 10;
                n /= 10;
            }

            System.out.println(first+last);
        }
    }
}
