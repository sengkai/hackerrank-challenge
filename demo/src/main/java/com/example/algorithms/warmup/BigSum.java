package com.example.algorithms.warmup;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 * Link: https://www.hackerrank.com/challenges/a-very-big-sum
 */
public class BigSum {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        BigInteger n = in.nextBigInteger();
        BigInteger[] bigIntegers = new BigInteger[n.intValue()];

        for (int i = 0; i < n.intValue(); i++) {
            bigIntegers[i] = in.nextBigInteger();
        }

        Long sum = 0L;
        for (int i = 0; i < bigIntegers.length; i++) {
            sum += Long.valueOf(bigIntegers[i].longValue());
        }

        System.out.println(sum);
    }

}
