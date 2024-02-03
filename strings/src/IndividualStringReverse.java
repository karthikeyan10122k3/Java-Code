package com.kar.practice.exercise.strings.src;

public class IndividualStringReverse {
    public static void main(String[] args) {

        System.out.println(reverseWords("Hello World"));
    }

    public static String reverseWords(String input) {
        String[] words = input.split(" ");
        StringBuilder reversedWords = new StringBuilder();

        for (String word : words) {
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedWords.append(reversedWord).append(" ");
        }

        return reversedWords.toString().trim();
    }

}
