package com.example.codingChallenge;

import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 * Link: https://www.hackerrank.com/challenges/30-operators
 */
public class Arithmetic {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double mealCost = scan.nextDouble(); // original meal price
        int tipPercent = scan.nextInt(); // tip percentage
        int taxPercent = scan.nextInt(); // tax percentage
        scan.close();

        // Write your calculation code here.
        double totalAmt = mealCost + totalTipsAmt(mealCost, tipPercent) + totalTaxAmt(mealCost, taxPercent);

        // cast the result of the rounding operation to an int and save it as totalCost 
        int totalCost = (int) Math.round(totalAmt);

        // Print your result
        System.out.println("The total meal cost is " + totalCost + " dollars.");
    }

    public static double tipPercentage(int tipPercent) {
        return (double) tipPercent / 100;
    }

    public static double taxPercentage(int taxPercent) {
        return (double) taxPercent / 100;
    }

    public static double totalTipsAmt(double mealCost, int tipPercent) {
        return (tipPercentage(tipPercent)) * mealCost;
    }

    public static double totalTaxAmt(double mealCost, int taxPercent) {
        return (taxPercentage(taxPercent)) * mealCost;
    }
}