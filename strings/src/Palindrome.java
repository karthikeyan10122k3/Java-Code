package com.kar.practice.exercise.strings.src;

public class Palindrome {
    public static void main(String[] args) {
        String input = "malayalam";
        StringBuilder str = new StringBuilder(input);
        String result = input.equals(String.valueOf(str.reverse())) ? "Yes" : "No" ;
        System.out.println(result);

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != input.charAt(input.length() -1 -i)){
                System.out.println("Not a Palindrome");
                return;
            }
        }
        System.out.println("Palindrome");
    }
}
