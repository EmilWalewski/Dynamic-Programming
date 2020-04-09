package com.company;

import java.util.Scanner;

public class BlockGame {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;
        int gameN, ans;

        while (t-- > 0){

            n = input.nextInt();
            ans = n;
            gameN = 0;

            while (n > 0){

                gameN = gameN*10 + n%10;
                n /= 10;
            }

            if (gameN == ans)
            System.out.println("wins");
            else
            System.out.println("losses");

        }
    }
}
