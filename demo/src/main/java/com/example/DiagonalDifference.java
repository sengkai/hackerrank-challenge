package com.example;

import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 */
public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = Integer.parseInt(in.nextLine());
        int suma = 0;
        int sumb = 0;

        for (int curr1 = 0, curr2 = n - 1; curr1 < n; curr1++, curr2--) {
            String[] inputLine = in.nextLine().split(" ");

            suma += Integer.valueOf(inputLine[curr1]);
            sumb += Integer.valueOf(inputLine[curr2]);
        }

        System.out.println(Math.abs(suma - sumb));
    }
}
