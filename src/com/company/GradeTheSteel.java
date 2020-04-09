package com.company;

import java.util.Locale;
import java.util.Scanner;

public class GradeTheSteel {

    public static void solve(Scanner input) {

        input.useLocale(Locale.US);

        int t = input.nextInt();
        int h;
        double cc;
        int tensile;
        boolean first_con, sec_con, thr_con;

        while (t-- > 0){

            h = input.nextInt();
            cc = input.nextDouble();
            tensile = input.nextInt();

            first_con = false;
            sec_con = false;
            thr_con = false;

            if (h > 50)
                first_con = true;
            if (cc < 0.7)
                sec_con = true;
            if (tensile > 5600)
                thr_con = true;

            if (first_con && sec_con && thr_con)
                System.out.println("10");
            else if (first_con && sec_con)
                System.out.println("9");
            else if (sec_con && thr_con)
                System.out.println("8");
            else if (first_con && thr_con)
                System.out.println("7");
            else if (first_con || sec_con || thr_con)
                System.out.println("6");
            else
                System.out.println('5');

        }

    }
}
