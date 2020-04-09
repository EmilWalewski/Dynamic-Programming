package com.company;

import java.util.Scanner;

public class SmallFactorials {


    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;

        while (t-- > 0){

            n = input.nextInt();

            System.out.println(solveProblem(n, n-1));
        }
    }

    private static int solveProblem(int n, int n2) {

        if (n2 > 1)
            return solveProblem(n*(n2--), n2);

        return n;
    }
}
