package com.company;

import java.util.Scanner;

public class GreddyPuppy {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n, k;

        while (t-- > 0){

            n = input.nextInt();
            k = input.nextInt();

            System.out.println(n%k);
        }
    }
}
