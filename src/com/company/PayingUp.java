package com.company;

import java.util.Scanner;

public class PayingUp {

    public static void solve(Scanner input){

        int t = input.nextInt();

        while (t-- > 0){

            solveProblem(input);
        }
    }

    private static void solveProblem(Scanner input) {

        int n = input.nextInt();  //bancknotes amount
        int m = input.nextInt();  //robber VALUE demand
        int[] vallet = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++)
            vallet[i] = input.nextInt();

        rangeof(vallet, n, m);

//        vallet = MergeSort.sort(vallet);
//
//        for (int i = 0; i < n; i++){
//
//            if (sum > 0 && sum + vallet[i] <= m) {
//                sum += vallet[i];
//                if (sum == m){
//                    break;
//                }
//            }
//
//            if (vallet[i] == m){
//                sum = m;
//                break;
//            }
//
//            if (vallet[i] > m){
//                sum += vallet[i-1];
//                i = -1;
//            }
//
//            if (i == n - 1 && sum == 0){
//                sum += vallet[i];
//                i = -1;
//            }
//
//        }
//
//        if (sum == m) System.out.println("YES");
//        else
//        System.out.println("NO");
    }


    public static int sumofsubset(int a[], int n)
    {
        int sum = 0;
        int i=0;
        while(n>0)
        {

            if((n&1)==1){
                sum = sum + a[i];
                // System.out.print("{"+a[i]+" "+ i +"} ");
            }
            else
            {

            }
            n = n>>1;
            i++;
        }
        // System.out.println();

        return sum;

    }

    public static boolean rangeof(int a[], int n, int m)
    {
        int range = (1<<n) - 1;
        int max = 0;
        for(int i=0; i<=range; i++)
        {
            int res = sumofsubset(a, i);
            //System.out.println("{"+i+"}");
            //System.out.println(res);

            if(m == res){
                return true;
            }

        }
        return false;
    }
}
