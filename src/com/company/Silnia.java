package com.company;

import java.util.Scanner;

public class Silnia {

//    input
//    2
//    20
//    36

    public static void ilosc_zer_na_koncy_silni(Scanner input) {

        int t = input.nextInt();
        int factorial;
        int divider;
        int sum ;

        while (t-- > 0) {

            sum = 0;
            divider = 5;
            factorial = input.nextInt();

            do {

                sum += factorial/divider;
                divider *= 5;

            }while (divider <= factorial);

            System.out.println(sum);

        }
    }
}

