package com.example.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 */
public class Staircase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int counter = 1;
        for (int i = 0; i < n; i++) {

            System.out.println(appendSymbol(n - counter, " ") + appendSymbol(counter, "#"));
            counter++;
        }
    }

    private static String appendSymbol(int noOfCharacters, String val) {
        String temp = "";
        for (int i = 0; i < noOfCharacters; i++) {
            temp += val;
        }
        return temp;
    }
}
