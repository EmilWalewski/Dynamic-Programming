package com.company;

import java.util.Scanner;

public class TheLeadGame {


    public static void solve(Scanner input) {

        int t = input.nextInt();
        int p1, p2;
        int leadSum = 0;
        int currentPlayer = 0;
        int points_difference;

        while (t-- > 0){

            p1 = input.nextInt();
            p2 = input.nextInt();

            points_difference = p1 - p2;

            if (Math.abs(points_difference) > leadSum){
                leadSum = Math.abs(points_difference);
                currentPlayer = points_difference > 0 ? 1 : 2;
            }
        }
        System.out.println(currentPlayer+" "+leadSum);

    }
}
