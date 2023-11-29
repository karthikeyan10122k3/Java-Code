package com.kar.practice.exercise.String.src;

public class Palindrome {
    public static void main(String[] args) {
        String input = "madam";
        StringBuilder str = new StringBuilder(input);
        String result = input.equals(String.valueOf(str.reverse())) ? "Yes" : "No" ;
        System.out.println(result);
    }
}
