package com.company;

import java.text.DecimalFormat;
import java.util.Scanner;

public class TotalExpenses {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int price;
        int quantity;
        DecimalFormat format =new java.text.DecimalFormat("0.000000");


        while (t-- > 0){


            quantity = input.nextInt();
            price = input.nextInt();

            if (quantity > 1000){

                System.out.println(format.format(quantity * price * 0.9));
            }
            else
                System.out.println(format.format(quantity * price));


        }
    }
}
