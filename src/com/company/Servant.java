package com.company;

import java.util.Scanner;

public class Servant {


    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;

        while (t-- > 0){

            n = input.nextInt();

            if (n < 10) System.out.println("What an obedient servant");
            else System.out.println("-1");

        }
    }
}
