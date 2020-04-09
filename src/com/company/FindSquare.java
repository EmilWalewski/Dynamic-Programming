package com.company;

import java.util.Scanner;

public class FindSquare {


    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;
        int counter = 0;
        int temp=0;
        int result=0;

        while (t-- > 0){

            n = input.nextInt();

            result=(n/2);

            do{
                temp=result;
                result=(temp+(n/temp))/2;

            }while((result-temp)!=0);

            System.out.println(result);

//            n = (int)Math.pow(n, 0.5);
//            while (){
//
//            }
//
//            System.out.println(n);
        }
    }
}
