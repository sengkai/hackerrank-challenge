package com.example.codingChallenge;

import java.util.Scanner;

/**
 * Created by sengkai on 6/20/2017.
 * https://www.hackerrank.com/challenges/30-arrays/problem
 */
public class Arrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();

        java.util.Arrays.stream(reverseArray(arr)).forEach(value -> System.out.print(value + " "));
    }

    private static int[] reverseArray(int[] arr){
        int arraySize = arr.length;

        int[] reverseArr = new int[arraySize];

        int counter = 0;
        while(arraySize > 0){
            reverseArr[counter] = arr[--arraySize];
            counter++;
        }

        return reverseArr;
    }
}
