package com.company;

import java.util.Scanner;

import static java.lang.Math.min;

public class SubArray {

    public static void solve(Scanner input) {

        int[] n = new int[8];


        for (int i = 0; i < n.length; i++){
            n[i] = input.nextInt();
        }

        int best = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < n.length; i++) {
            sum = Math.max(0, sum+n[i]);
            best = Math.max(best, sum);
        }


        System.out.println(best);

    }

}


//-1 2 4 -3 5 2 -5 2

//-2 1 -3 4 -1 2 1 -5 4

//-2 -1 -4 0 -1 1 2 -3 1