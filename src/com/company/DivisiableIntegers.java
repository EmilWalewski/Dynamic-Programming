package com.company;

import java.util.Scanner;

public class DivisiableIntegers {


    public static void solve(Scanner input) {

        int n = input.nextInt();
        int k = input.nextInt();

        int value;
        int amount = 0;

        for (int i = 0; i < n; i++){
            value = input.nextInt();

            if (value % k == 0) amount++;
        }

        System.out.println(amount);
    }


}
