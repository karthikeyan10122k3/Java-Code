package com.kar.practice.exercise.arrays.src;

public class FindFirstPalindromicStringInArray {
    public static void main(String[] args) {
        String[] words = {"abc", "car", "ada", "racecar", "cool"};
        System.out.println(firstPalindrome(words));
    }
    public static String firstPalindrome(String[] words) {

        for (String word : words) {
            if (word.charAt(0) == word.charAt(word.length() - 1) && isPalindrome(word)) {
                return word;
            }
        }
        return "";
    }

    private static boolean isPalindrome(String word) {
        int left = 0;
        int right = word.length() - 1;

        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;

    }
}
