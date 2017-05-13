package com.example.algorithms.warmup;

import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 * Link: https://www.hackerrank.com/challenges/mini-max-sum
 */
public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for (int arr_i = 0; arr_i < 5; arr_i++) {
            arr[arr_i] = in.nextInt();
        }

        Long[] sumArr = totalSumCalculated(arr);

        System.out.println(calculateMinMax(sumArr)[0] + " " + calculateMinMax(sumArr)[1]);
    }

    private static Long[] totalSumCalculated(int[] arr) {

        int counter = 0;
        Long[] arrSize = new Long[arr.length];
        for (int i = 0; i < arr.length; i++) {
            Long sum = 0L;
            for (int j = 0; j < arr.length; j++) {
                if (i != j) {
                    sum += arr[j];
                }
            }
            arrSize[i] = sum;
        }

        return arrSize;
    }

    private static Long[] calculateMinMax(Long[] arr) {
        Long[] minMax = new Long[2];
        Long min = 0L;
        Long max = 0L;

        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                min = arr[i];
                max = arr[i];
            } else {
                min = arr[i] < min ? arr[i] : min;
                max = arr[i] > max ? arr[i] : max;
            }
        }
        return new Long[]{min, max};
    }
}
