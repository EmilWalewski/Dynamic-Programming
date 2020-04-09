package com.company;

import java.util.Scanner;

public class CupCakes {


    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;
        int packageCap = 1;
        int cupCakesLeft = 0;
        int maxCupCakesLeft = 0;

        while (t-- > 0){

            n = input.nextInt();
            maxCupCakesLeft = 0;
            packageCap = 1;

            for (int i = 0; i < n; i++){

                cupCakesLeft = n % packageCap++;

                if (cupCakesLeft > maxCupCakesLeft)
                    maxCupCakesLeft = cupCakesLeft;

            }

            System.out.println(n - maxCupCakesLeft);

        }
    }
}
