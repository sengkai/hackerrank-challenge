package com.example;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

/**
 * Created by extin on 5/10/2017.
 */
public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String inputTime = in.nextLine();

        SimpleDateFormat date12Format = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat date24Format = new SimpleDateFormat("HH:mm:ss");

        try {
            System.out.println(date24Format.format(date12Format.parse(inputTime)));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
