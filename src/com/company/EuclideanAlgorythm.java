package com.company;

import java.util.Scanner;

public class EuclideanAlgorythm {

    public static void solve(Scanner input) {

        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println(gcd(a, b));
    }

    private static int gcd(int a, int b) {

        return a % b == 0 ? b : gcd(b, a % b);
    }
}
