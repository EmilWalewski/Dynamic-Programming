package com.company;

import java.util.Scanner;

public class RepatedSumOfDigits {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;

        if (t >= 1 && t <= 100) {
            while (t-- > 0) {

                n = input.nextInt();

                if (n >= 1 && n <= 1000000)
                    System.out.println(recursiveSolveProblem(n));
            }
        }
    }

    private static int recursiveSolveProblem(int n){

        int sum = 0;

        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }

        return (sum > 9 ? recursiveSolveProblem(sum) : sum) ;

    }
}
