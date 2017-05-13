package com.example.codingChallenge;

import java.util.Scanner;

/**
 * Created by extin on 5/9/2017.
 * Link: https://www.hackerrank.com/challenges/30-data-types
 */
public class Data_Types {

    public static void main(String[] args) {
        int i = 4;
        double d = 4.0;
        String s = "HackerRank ";

        Scanner scan = new Scanner(System.in);

        /* Declare second integer, double, and String variables. */
        int integer = 0;
        double doubl3 = 0.0;
        String val = "";

        /* Read and save an integer, double, and String to your variables.*/
        // Note: If you have trouble reading the entire String, please go back and review the Tutorial closely.
        integer = scan.nextInt();
        doubl3 = scan.nextDouble();
        scan.nextLine();
        val = scan.nextLine();

        /* Print the sum of both integer variables on a new line. */
        System.out.println(i + integer);

        /* Print the sum of the double variables on a new line. */
        System.out.println(d + doubl3);

        /* Concatenate and print the String variables on a new line;
            the 's' variable above should be printed first. */
        System.out.println(s + val);
    }


}
