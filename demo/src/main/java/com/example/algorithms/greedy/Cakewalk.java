package com.example.algorithms.greedy;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by extin on 5/13/2017.
 * Link: https://www.hackerrank.com/challenges/marcs-cakewalk
 */
public class Cakewalk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for (int calories_i = 0; calories_i < n; calories_i++) {
            calories[calories_i] = in.nextInt();
        }
        // your code goes here
        Arrays.sort(calories);

        System.out.print(getMiles(calories));
    }

    private static long getMiles(int[] calories) {
        long miles = 0;
        for (int i = 0; i < calories.length; i++) {
            /**
             * i position will always be at 0 thus
             * E.g. Array total length = 3 {1,2,3}
             *      index i = 0
             *      To get from the last position
             *       3 - 1 - 0 = 2
             */
            int temp = calories[calories.length - 1 - i];
            miles += Math.pow(2, i) * temp;
        }
        return miles;
    }
}
