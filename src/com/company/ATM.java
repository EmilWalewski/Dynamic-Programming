package com.company;

import java.util.Locale;
import java.util.Scanner;

public class ATM {


    public static void solve(Scanner input) {

        input.useLocale(Locale.US);

        int x = input.nextInt();
        double y = input.nextDouble();

        if (x <= 2000 && y <= 2000){

            if (x % 5 == 0 && x < y){
                double bal = y - x - 0.5;
                System.out.println(bal);
            }
            else
                System.out.println(y);
        }

    }
}
