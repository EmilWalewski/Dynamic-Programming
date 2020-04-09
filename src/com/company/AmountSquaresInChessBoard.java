package com.company;

import java.util.Scanner;

public class AmountSquaresInChessBoard {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;

        while (t-- > 0){

            n = input.nextInt();

            System.out.println((n*(n+1)*(2*n+1))/6);
        }
    }
}
