package com.company;

import java.util.Scanner;

public class PancakeFlipper {


    public static void solve(Scanner input) {

        int t = input.nextInt();
        String s;
        int spatula = 0;
        int[] n;
        int amount = 0;
        boolean change = false;

        while (t-- > 0){

            s = input.next();
            n = new int[s.length()];
            spatula = input.nextInt();
            amount = 0;
            change = false;

            for (int i = 0; i < n.length; i++) {
                if (s.charAt(i) == '+')
                    n[i] = 1;
                else
                    n[i] = 0;
            }

            for (int i = 0; i < n.length; i++) {
                if (i + spatula - 1 < n.length) {
                    if (n[i] == 0) {
                        for (int j = i; j < spatula + i; j++) {
                            if (n[j] == 0)
                                n[j] = 1;
                            else
                                n[j] = 0;
                        }
                        amount++;
                    }
                }
            }

            for (int i = 0; i < n.length; i++)
                if (n[i] != 1) amount = -1;
            System.out.println((amount >= 0) ? amount : "IMPOSSIBLE");


        }
    }
}
