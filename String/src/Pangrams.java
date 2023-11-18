package com.kar.practice.exercise.String.src;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Pangrams {
    public static void main(String[] args) {
        String s = "We promptly judged antique ivory buckles for the next prize";
        System.out.print(pangrams(s));
//        pangrams(s);
    }
    public static String pangrams(String s) {
        char[] arr = s.toLowerCase().toCharArray();
        Arrays.sort(arr);

        HashSet<Character> charSet = new HashSet<>();
        for (char c : arr) {
            if (!Character.isWhitespace(c)) {
                charSet.add(c);
            }
        }
        System.out.println("Char Set: " + charSet);

        HashSet<Character> alphabetSet = new HashSet<>();
        for (char c = 'a'; c <= 'z'; c++) {
            alphabetSet.add(c);
        }
        System.out.println("Alphabet Set: " + alphabetSet);

        if (charSet.equals(alphabetSet)) {
            return "Pangram";
        }
        return "Not Pangram";
    }

}
