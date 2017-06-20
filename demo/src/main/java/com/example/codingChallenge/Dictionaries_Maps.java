package com.example.codingChallenge;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by sengkai on 6/20/2017.
 * https://www.hackerrank.com/challenges/30-dictionaries-and-maps/problem
 */
public class Dictionaries_Maps {

    public static void main(String []argh){
        Scanner in = new Scanner(System.in);
        Map<String, Integer> phoneBook = new HashMap<String, Integer>();
        int n = in.nextInt();
        for(int i = 0; i < n; i++){
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            if(name != null && phone >= 0){
                phoneBook.put(name, phone);
            }
        }
        int counter = 0;
        while(in.hasNext() && (counter < n)){
            String s = in.next();
            // Write code here
            if(phoneBook.containsKey(s)){
                System.out.println(s + "="+phoneBook.get(s));
            }else{
                System.out.println("Not found");
            }
            counter++;
        }
        in.close();
    }

}
