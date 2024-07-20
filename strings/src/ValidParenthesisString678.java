package com.kar.practice.exercise.strings.src;

import java.util.Stack;

public class ValidParenthesisString678 {
    public static void main(String[] args) {
        String s = "((*))";
        System.out.println(checkValidString(s));
    }
    public static boolean checkValidString(String s) {
        int balance = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '(' || ch == '*') {
                balance++;
            } else if (ch == ')') {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }

        balance = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            char ch = s.charAt(i);
            if (ch == ')' || ch == '*') {
                balance++;
            } else if (ch == '(') {
                balance--;
            }
            if (balance < 0) {
                return false;
            }
        }

        return true;
    }
}
