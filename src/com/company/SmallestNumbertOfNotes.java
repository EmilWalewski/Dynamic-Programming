package com.company;

import java.util.Scanner;

public class SmallestNumbertOfNotes {

    public static void solve(Scanner input) {

        int t = input.nextInt();

        int[] notes = new int[]{1, 2, 5, 10, 50, 100};

        int n;
        int sum = 0;

        while (t-- > 0){

            n = input.nextInt();

            while (n != 0){

                if (n >= 100){
                    sum += n/100;
                    n = n%100;
                }

                System.out.println(sum);
            }

        }
    }

}
