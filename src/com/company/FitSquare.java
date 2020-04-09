package com.company;

import java.util.Scanner;

public class FitSquare {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int b;
        int[] table = new int[t];
        table[0] = 0;
        table[1] = 0;
        table[2] = 0;

        while (t-- > 0){

            b = input.nextInt();

            System.out.println(check(b, table));

        }
    }

    private static int check(int b, int[] table) {

        if (b == 1 || b == 2 || b == 3)
            return 0;

        int f = (b/2 - 1) + table[b - 3];
        table[b-1] = f;

        return f;

    }
}
