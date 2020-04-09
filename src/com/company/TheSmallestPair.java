package com.company;

import java.util.Scanner;

public class TheSmallestPair {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;
        int[] table;

        int sum ;
        int min;

        while (t-- > 0){

            n = input.nextInt();
            table = new int[n];
            sum = Integer.MAX_VALUE;
            min = Integer.MAX_VALUE;

            for (int i = 0; i < n; i++){
                table[i] = input.nextInt();
            }


            for (int i = 0; i < n - 1; i++){

                sum = Math.min(sum, table[i] + table[i + 1]);
                min = Math.min(min, sum);

            }

            System.out.println(min);


        }

    }
}
