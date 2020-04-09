package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class HorseRace {

//          input
//            1
//            5
//            4 9 1 32 13

    public static void solve(){

        Scanner input = new Scanner(System.in);

        int t = input.nextInt();
        int n = input.nextInt();
        int[] s = new int[n];

        while (t-- > 0) {

            for (int i = 0; i < n; i++)
                s[i] = input.nextInt();

            Arrays.sort(s);

            int actualDiffer = 0;

            for (int i = 0; i < n - 1; i++) {

                if (i == 0) {
                    actualDiffer = Math.abs(s[i] - s[i + 1]);
                    continue;
                }

                if (Math.abs(s[i] - s[i + 1]) < actualDiffer) actualDiffer = Math.abs(s[i] - s[i + 1]);


            }

            System.out.println(actualDiffer);
        }
    }
}
