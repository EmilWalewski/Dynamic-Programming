package com.company;

import java.util.Scanner;

public class Lucky4 {


    //ilosc wystapien cyfry 4 w liczbie

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;
        int amount;

        while (t-- > 0){

            n = input.nextInt();
            amount = 0;

            while (n > 0){

                if (n % 10 == 4)
                    amount++;

                n /= 10;
            }

            System.out.println(amount);
        }
    }
}
