package com.company;

import java.util.Scanner;

public class TanuAndHeadBob {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;
        String s;
        boolean flag = false;
        int containY = 0;

        while (t-- > 0){

            n = input.nextInt();
            s = input.next();
            containY = 0;
            flag = false;

            for (int i = 0; i < n; i++){

                if(s.charAt(i) == 'Y') {
                    flag = false;
                    containY = 1;
                }
                if (s.charAt(i) == 'I')
                    flag = true;
            }

            if (flag)
                System.out.println("INDIAN");

            else {
                if (containY > 0)
                System.out.println("NOT INDIAN");
                else
                System.out.println("NOT SURE");
            }

        }

    }
}
