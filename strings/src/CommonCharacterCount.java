package com.kar.practice.exercise.strings.src;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.TreeMap;

public class CommonCharacterCount {
    public static void main(String[] args) {
        String s1 = "aaa" , s2 = "aaaaa";

        System.out.println(solution(s1,s2));
    }

    private static int solution(String s1, String s2) {

        TreeMap<Character, Integer> charFrequencyMap1 = new TreeMap<>();
        for (char c : s1.toCharArray()) {
                if (charFrequencyMap1.containsKey(c)) {
                    charFrequencyMap1.put(c, charFrequencyMap1.get(c) + 1);
                } else {
                    charFrequencyMap1.put(c, 1);
                }
        }
        TreeMap<Character, Integer> charFrequencyMap2 = new TreeMap<>();
        for (char c : s2.toCharArray()) {
            if (charFrequencyMap2.containsKey(c)) {
                charFrequencyMap2.put(c, charFrequencyMap2.get(c) + 1);
            } else {
                charFrequencyMap2.put(c, 1);
            }
        }

        int tot = 0;
        for (Character key : charFrequencyMap1.keySet()) {
            if (charFrequencyMap2.containsKey(key)) {
                int value1 = charFrequencyMap1.get(key);
                int value2 = charFrequencyMap2.get(key);
                int  minValue = Math.min(value1, value2);
                tot += minValue;
            }
        }
        return tot;
    }
}
