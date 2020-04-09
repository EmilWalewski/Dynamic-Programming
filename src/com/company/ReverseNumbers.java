package com.company;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ReverseNumbers {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;
        int sum;

        while (t-- > 0){

            n = input.nextInt();
            sum = 0;

            while (n > 0) {

                sum = sum*10 + (n % 10);
                n /= 10;
            }

            System.out.println(sum);

        }
    }
}
