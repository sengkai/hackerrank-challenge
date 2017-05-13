package com.example;

import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 */
public class FindMaxCandleBlown {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int height[] = new int[n];
        for (int height_i = 0; height_i < n; height_i++) {
            height[height_i] = in.nextInt();
        }

        int maxHeight = findMaxHeight(height);

        System.out.println(countNoOfCandlesBlown(maxHeight, height));
    }

    private static int findMaxHeight(int height[]) {
        int maxHeight = 0;
        for (int i = 0; i < height.length; i++) {
            if (i == 0) {
                maxHeight = height[i];
            } else if (height[i] > maxHeight) {
                maxHeight = height[i];
            }
        }
        return maxHeight;
    }

    private static int countNoOfCandlesBlown(int maxHeight, int height[]) {

        int counter = 0;
        for (int i = 0; i < height.length; i++) {
            if (height[i] == maxHeight) {
                counter++;
            }
        }

        return counter;
    }
}
