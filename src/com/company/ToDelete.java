package com.company;

public class ToDelete {

    public static void solve() {

        int[] a = new int[]{ 70, 250, 50, 80, 140, 12, 14 };
        int max;

        // recursion - DAC_Max function called
        max = DAC_Max(a, 0, 7);

        System.out.println(max);

    }

    static int DAC_Max(int a[], int index, int l)
    {
        int max;
        if (index >= l - 2) {
            if (a[index] > a[index + 1])
                return a[index];
            else
                return a[index + 1];
        }

        // logic to find the Maximum element
        // in the given array.
        max = DAC_Max(a, index + 1, l);

        if (a[index] > max)
            return a[index];
        else
            return max;
    }
}
