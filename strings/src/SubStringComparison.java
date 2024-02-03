package com.kar.practice.exercise.strings.src;

public class SubStringComparison {
    public static void main(String[] args) {
        String inputString = "welcometojava";
        int noOCharacters = 3;
        System.out.println(getSmallestAndLargest(inputString,noOCharacters));
    }
    public static String getSmallestAndLargest(String s, int k) {
        String smallest = s.substring(0, k);
        String largest = s.substring(0, k);
        String subString = "";

        for (int i = 1; i <= s.length() - k; i++) {
            subString = s.substring(i, i + k);

            if (subString.compareTo(smallest) < 0) {
                smallest = subString;
            }

            if (subString.compareTo(largest) > 0) {
                largest = subString;
            }
        }

        return smallest + "\n" + largest;
    }

}
