package com.example.implementation;

import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 * Link: https://www.hackerrank.com/challenges/grading
 */
public class GradingStudents {
    static int[] solve(int[] grades) {
        int[] finalGrade = new int[grades.length];
        // Complete this function
        for (int i = 0; i < grades.length; i++) {
            if ((Math.round(grades[i]) - grades[i]) < 3) {
                finalGrade[i] = Math.round(grades[i]);
            } else {
                finalGrade[i] = grades[i];
            }
        }
        return finalGrade;
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
