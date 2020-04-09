package com.company;

import java.util.Scanner;

public class PuppyAndSum {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int d, n;
        int sum;


        while (t-- > 0){

            d = input.nextInt();
            n = input.nextInt();

            System.out.println(sumP(d, n));

        }
    }

    private static int sumF(int n) {
        return n > 0 ? n += sumF(n-1) : n;
    }

    private static int sumP(int d, int n) {

        while (d-- > 0){
            n = sumF(n);
        }
        return n;

    }
}
