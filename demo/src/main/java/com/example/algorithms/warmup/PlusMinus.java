package com.example.algorithms.warmup;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 * Link: https://www.hackerrank.com/challenges/plus-minus
 */
public class PlusMinus {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        DecimalFormat df = new DecimalFormat("0.000000");

        double positive = 0;
        double neg = 0;
        double zero = 0;

        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();

            if (a[i] == 0)
                zero++;
            else if (a[i] > 0)
                positive++;
            else if (a[i] < 0)
                neg++;
        }

        System.out.println(df.format(positive / n));
        System.out.println(df.format(neg / n));
        System.out.println(df.format(zero / n));
    }
}
