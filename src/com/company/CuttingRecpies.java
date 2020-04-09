package com.company;

import java.util.Scanner;

public class CuttingRecpies {

    public static void solve(Scanner input) {

        int t = input.nextInt();
        int n;
        int[] ingredients;
        int currentDivisor = 0;
        int maxDivisor = 0;

        while (t-- > 0){

            n = input.nextInt();
            ingredients = new int[n];

            for (int i = 0; i < n; i++){

                ingredients[i] = input.nextInt();
            }

            int max = g(ingredients);

            for (int i = 0; i < ingredients.length; i++)
                ingredients[i] = ingredients[i] / max;

            for (int i = 0; i < ingredients.length; i++)
            System.out.print(ingredients[i]+" ");

            System.out.println(" ");
        }
    }

    private static int g(int[] ingredients) {

        int max = ingredients[0];

        for (int i = 1; i < ingredients.length; i++){

            if (max < ingredients[i])
                max = gcd(max, ingredients[i]);
            else
                max = gcd(ingredients[i], max);

        }

        return max;

    }


    private static int gcd(int ingredient, int ingredient1) {

        return ingredient % ingredient1 == 0 ? ingredient1 : gcd(ingredient1, ingredient % ingredient1);
    }
}

