package com.kar.practice.exercise.strings.src;

public class StringToken {
    public static void main(String[] args) {
        String str = "           YES      leading spaces        are valid,    problemsetters are         evillllll";
        String[] tokens = str.trim().split("[ ,.'?!]+");
        System.out.println(tokens.length);
        for (int i = 0; i < tokens.length; i++) {
            System.out.println(tokens[i]);
        }
    }
}
