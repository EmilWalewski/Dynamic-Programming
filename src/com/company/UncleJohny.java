package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class UncleJohny {

//        Input:
//            3
//            4
//            1 3 4 2
//            2
//            5
//            1 2 3 9 4
//            5
//            5
//            1 2 3 9 4
//            1

    public static void solve(Scanner input){

        int t = input.nextInt();

        long start = System.currentTimeMillis();

        while (t-- > 0){

            findMusic(input);
        }

        System.out.println(System.currentTimeMillis()-start);
    }

    private static void findMusic(Scanner input) {

        int n = input.nextInt();

        int[] musicArray = new int[n];

        for (int i = 0; i < n; i++) {
            musicArray[i] = input.nextInt();
        }

        int uncleValue = musicArray[input.nextInt()-1];

        musicArray = MergeSort.sort(musicArray);

        for (int i = 0; i < n; i++)
            if (musicArray[i] == uncleValue) {
                System.out.println(i+1);
                break;
            }
    }

}
