package com.example.algorithms.implementation;

import java.util.Scanner;

/**
 * Created by extin on 5/13/2017.
 * Link: https://www.hackerrank.com/challenges/grading
 */
public class GradingStudent {

    static int[] solve(int[] grades) {
        int[] finalGrade = new int[grades.length];
        // Complete this function
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= 38 && (grades[i] % 5) >= 3) {
                finalGrade[i] = roundUp(grades[i]);
            } else {
                finalGrade[i] = grades[i];
            }
        }
        return finalGrade;
    }

    private static int roundUp(int result) {
        return result + 5 - result % 5;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for (int grades_i = 0; grades_i < n; grades_i++) {
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}
