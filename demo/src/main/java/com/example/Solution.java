package com.example;

import java.util.Stack;

public class Solution {

    private static final String NO_SPACE = "";
    private static final String SINGLE_SPACE = " ";
    private static final String ALPHANUMERICAL = ".*[^a-zA-Z0-9].*";
    private static final String NUMERICAL = "[0-9]";
    private static final String ALPHA = "[a-zA-Z]";

    public static void main(String[] args) {
        String test = "(())))(";
        System.out.println(solution(test));
    }

    public static int solution(String S) {
        if (S.isEmpty()) return 0;

        Stack<Character> stack = new Stack<>();

        int matchingCounter = 0;
        int unMatchedCounter = 0;
        for (int i = 0; i < S.length(); i++) {
            char current = S.charAt(i);
            switch (current) {
                case '}':
                    if (!stack.isEmpty() && stack.peek() == '{') {
                        stack.pop();
                        matchingCounter += 2;
                    } else
                        unMatchedCounter++;
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek() == '[') {
                        stack.pop();
                        matchingCounter += 2;
                    } else
                        unMatchedCounter++;
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek() == '(') {
                        stack.pop();
                        matchingCounter += 2;
                    } else
                        unMatchedCounter++;
                    break;
                default:
                    stack.push(current);
                    break;
            }
        }
        System.out.println("Stack Size :: " + (matchingCounter / 2) + " Unmatched :: " + unMatchedCounter);
        /*if(stack.size() % 2 == 1){
            return stack.size() - (stack.size()/2);
        }else if(stack.size() == 0){
            return S.length();
        }else{
            return (stack.size()/2);
        }*/
        return (matchingCounter / 2) + unMatchedCounter;
    }

}