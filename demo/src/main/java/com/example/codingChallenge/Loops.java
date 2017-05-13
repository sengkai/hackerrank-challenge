package com.example.codingChallenge;

import java.util.Scanner;

/**
 * Created by extin on 5/13/2017.
 * Links: https://www.hackerrank.com/challenges/30-loops
 */
public class Loops {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for (int i = 1; i <= 10; i++) {

            System.out.println(n + " x " + i + " = " + calculateResult(n, i));
        }
    }

    private static int calculateResult(int n, int counter) {
        return n * counter;
    }
}
