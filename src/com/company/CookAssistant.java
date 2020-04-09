package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CookAssistant {

    public static void solve(Scanner input){

        int t = input.nextInt();

        long start = System.currentTimeMillis();

        while (t-- > 0){

            solveProblem(input);
        }
        System.out.println(System.currentTimeMillis() - start);
    }

    private static void solveProblem(Scanner input) {

        int n = input.nextInt();
        int m = input.nextInt();
        int[] undoneArray = new int[n-m];
        List<Integer> doneList = new ArrayList<>(m);

        for (int i = 0; i < m; i++)
            doneList.add(input.nextInt());

        int index = 0;
        for (int i = 1; i <= n; i++)
            if (!doneList.contains(i)){
                undoneArray[index++] = i;
            }

        for (int i = 0; i < undoneArray.length; i+=2)
            System.out.print(undoneArray[i]+" ");

        System.out.println(" ");
        for (int i = 1; i < undoneArray.length; i+=2)
            System.out.print(undoneArray[i]+" ");
    }
}
