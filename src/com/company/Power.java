package com.company;

import java.util.Scanner;

public class Power {


    public static void solve(Scanner input) {

        int n = input.nextInt();
        int counter = 0;

        while (true) {
            if (Math.pow(2, counter++) > n)
                break;
        }

        counter-=2;

        int currentGap = 0;
        int maxGap = 0;
        int numberLeft = n;

        while (numberLeft > 0){

            int power = (int)Math.pow(2, counter);

            if (power <= numberLeft){
                numberLeft -= power;
                if (currentGap > maxGap)
                    maxGap = currentGap;

                currentGap = 0;
            }
            else currentGap++;

            counter--;

        }
        //32 -> 10000
        System.out.println(maxGap);
    }
}
