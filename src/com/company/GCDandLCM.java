package com.company;

import java.util.Scanner;

public class GCDandLCM {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int a, b;
        int gcdValue;

        while (t-- > 0){

            a = input.nextInt();
            b = input.nextInt();

            if (a > b) {
                gcdValue = gcd(a, b);
                System.out.println(gcdValue + " " + lcm(a, b,gcdValue));
            }
            else{
                gcdValue = gcd(b, a);
                System.out.println(gcdValue + " " + lcm(b, a,gcdValue));
            }



        }
    }

    private static int lcm(int a, int b, int gcd) {

        return Math.abs(a*b)/gcd;
    }

    private static int gcd(int a, int b) {

        return a % b == 0 ? b : gcd(b, a%b);

    }
}
