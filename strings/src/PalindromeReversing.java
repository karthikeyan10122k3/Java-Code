package com.kar.practice.exercise.strings.src;

import java.util.HashMap;
import java.util.Map;

public class PalindromeReversing {
    public static void main(String[] args) {
        String input = "malayalam";
        System.out.println(palindromeReversingCheck(input));
    }

    private static boolean palindromeReversingCheck(String input) {
        Map<Character,Integer> mapper = new HashMap<>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (mapper.containsKey(ch)){
                mapper.put(ch,mapper.get(ch)+1);
            }else {
                mapper.put(ch,1);
            }
        }
        int count=0;
        for (Character key : mapper.keySet()) {
            if (mapper.get(key)%2 !=0){
                count++;
                if (count >=2) return false;
            }
        }
        return true;
    }
}
