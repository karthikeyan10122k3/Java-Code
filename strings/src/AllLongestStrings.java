package com.kar.practice.exercise.strings.src;

import java.util.ArrayList;
import java.util.Arrays;

public class AllLongestStrings {
    public static void main(String[] args) {
        String[] inputArray = {"aba", "aa", "ad", "vcd", "aba"};

        System.out.println(Arrays.toString(solution(inputArray)));
    }

    private static String[] solution(String[] inputArray) {

        int maxLength = 0;
        ArrayList<String> solutionArray = new ArrayList<>();;
        for (String str: inputArray) {
            int currentLength = str.length();
            if (currentLength > maxLength) {
                solutionArray.clear();
                maxLength = currentLength;
            }
            if(currentLength == maxLength){
                solutionArray.add(str);
            }
        }
        return solutionArray.toArray(new String[0]);
    }
}
