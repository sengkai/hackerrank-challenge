package com.example.codingChallenge;

import java.util.Scanner;

/**
 * Created by extin on 5/13/2017.
 * Link: https://www.hackerrank.com/challenges/30-review-loop
 */
public class reviewLoop {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        String[] storeVal = new String[n];

        for (int i = 0; i < n; i++) {
            String val = scan.nextLine();
            storeVal[i] = val;
        }

        printOutput(storeVal);
    }

    private static void printOutput(String[] storeVal) {
        for (int i = 0; i < storeVal.length; i++) {
            System.out.println(findAllOddOrEven(storeVal[i]));
        }
    }

    private static String findAllOddOrEven(String value) {
        char[] charArr = value.toCharArray();
        String oddOutPut = "";
        String evenOutPut = "";
        for (int i = 0; i < charArr.length; i++) {

            if (i % 2 == 1) {
                oddOutPut += charArr[i];
            } else {
                evenOutPut += charArr[i];
            }
        }

        return evenOutPut + " " + oddOutPut;
    }
}
