package com.company;

import java.util.Scanner;

public class SumOfDigits {

    public static void solve(Scanner input) {

        int t = input.nextInt();

        while (t-- > 0){

            int n = input.nextInt();
            int sum = 0;

            while (n > 0){
                sum += n % 10;
                n /= 10;
            }

            System.out.println(sum);
        }
    }


}
