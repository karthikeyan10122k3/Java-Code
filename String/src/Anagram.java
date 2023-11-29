package com.kar.practice.exercise.String.src;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "hello";

        boolean result = isAnagram(str1, str2);
        System.out.println(result ? "Anagrams":"Not Anagrams");
    }
    public static boolean isAnagram(String a, String b) {
        a=a.toLowerCase();
        b=b.toLowerCase();
        char temp;
        char[] charArray1 = a.toCharArray();
        for (int i = 0; i < charArray1.length - 1; i++) {
            for (int j = 0; j < charArray1.length - i - 1; j++) {
                if (charArray1[j] > charArray1[j + 1]) {
                    temp = charArray1[j];
                    charArray1[j] = charArray1[j + 1];
                    charArray1[j + 1] = temp;
                }
            }
        }

        char[] charArray2 = b.toCharArray();
        for (int i = 0; i < charArray2.length - 1; i++) {
            for (int j = 0; j < charArray2.length - i - 1; j++) {
                if (charArray2[j] > charArray2[j + 1]) {
                    temp = charArray2[j];
                    charArray2[j] = charArray2[j + 1];
                    charArray2[j + 1] = temp;
                }
            }
        }
        if (String.valueOf(charArray1).compareTo(String.valueOf(charArray2)) == 0) {
            System.out.println("true");
            return true;
        }

        System.out.println("False");
        return false;

    }
}
