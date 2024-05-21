package com.kar.practice.exercise.arrays.src;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class FirstNotRepeatingCharacter {
    public static void main(String[] args) {
        String inputString = "abacabad";
        System.out.println(solution(inputString));
    }
    static char solution(String s) {
        char nonRepeatingFirstChar = '_';
        LinkedHashMap<Character, Integer> count = new LinkedHashMap<>();

        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i),count.getOrDefault(s.charAt(i),0)+1);
        }

        for (Character ch: count.keySet()) {
            if(count.get(ch) == 1){
                return ch;
            }

        }

        return nonRepeatingFirstChar;
    }
}
