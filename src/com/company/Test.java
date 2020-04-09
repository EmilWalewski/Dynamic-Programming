package com.company;

import java.util.Scanner;

public class Test {


    public static void solve(Scanner input) {

        int x = input.nextInt();
        int[] n = new int[6];

        for (int i = 0; i < n.length; i++)
            n[i] = input.nextInt();

       int left = 0;
       int right = n.length - 1;
       int mid;
       int first_position = 0;

       while (left <= right){

           mid = left + (right - left)/2;

           if (n[mid] >= x){
               right = mid - 1;
               first_position = mid;
           }
           else{
              left = mid + 1;
           }
       }

        System.out.println(first_position);
        //5 7 7 8 8 10

    }


}
