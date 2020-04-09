package com.company;

import java.util.Scanner;

public class BinarySearch {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int[] n = new int[11];

        for (int i = 0; i < 11; i++){
            n[i] = input.nextInt();
        }


        int l = 0, r = n.length - 1;

        while (l <= r){

            int mid = l + (r - l)/2;

            if (n[mid] == t) {
                System.out.println(t);
                break;
            }

            if (t < n[mid])
                r = mid - 1;
            else
                l = mid + 1;
        }

//        System.out.println(recursiveBinarySearch(t, n, l, r));

    }

    private static boolean recursiveBinarySearch(int t, int[] n, int l, int r) {

        int mid = l + (r - l)/2;

        if (l > r)
            return false;

        if (n[mid] == t)
            return true;

        return (t < n[mid]) ?
                recursiveBinarySearch(t, n, l, mid - 1) :
                recursiveBinarySearch(t, n, mid + 1, r);
    }

}
