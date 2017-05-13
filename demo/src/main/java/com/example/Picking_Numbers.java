package com.example;

import java.util.Scanner;

/**
 * Created by extin on 5/7/2017.
 */
public class Picking_Numbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        int counter = 0;
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
            System.out.println("First Loop :: " + a[a_i]);
        }
        System.out.println("Counter :: " + counter + a);
        for (int i = 0; i < a.length; i++) {

            if (i == a.length)
                break;
            if ((a[i] - a[i + 1]) <= 1)
                counter++;
        }
    }
}
