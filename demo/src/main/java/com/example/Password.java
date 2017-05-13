package com.example;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by extin on 4/24/2017.
 */
public class Password {

    public static void main(String[] args) {
        System.out.println(longestPassword("a0Ba"));
    }

    public static int longestPassword(String S) {

//Split string by space
        String[] split = S.split(" ");
        ArrayList<Integer> passwordList = new ArrayList<Integer>();

//Check and add valid password's length to array
        for (String each : split) {
            if (each.matches("^[a-zA-Z0-9]*$")) {
                int digits = each.replaceAll("[^0-9.]", "").length();
                int alpha = each.length() - digits;

                if (digits % 2 != 0 && alpha % 2 == 0) {
                    passwordList.add(each.length());
                }
            }
        }
//Find max length password else return -1
        if (passwordList.size() > 0) {
            Collections.sort(passwordList);
            return passwordList.get(passwordList.size() - 1);
        } else
            return -1;
    }
}
