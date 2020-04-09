package com.company;

import java.util.Scanner;

public class Lapindrome {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        String n;
        int length;
        int first_half = 0;
        int second_half = 0;


        while (t-- > 0){

            n = input.next();

            length = n.length()/2;
            first_half = 0;
            second_half = 0;

            for (int i = 0; i < length; i++){

                first_half += (int)n.charAt(i);
            }

            if (n.length() % 2 != 0)
                length++;

            for (int i = length; i < n.length(); i++){

                second_half += (int)n.charAt(i);
            }

            if (first_half == second_half)
                System.out.println("YES");
            else
                System.out.println("NO");

        }
    }
}
