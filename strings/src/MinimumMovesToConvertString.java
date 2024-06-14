package com.kar.practice.exercise.strings.src;

public class MinimumMovesToConvertString {
    public static void main(String[] args) {
        String input = "XXXX";
        System.out.println(minimumMoves(input));
    }


    public static int minimumMoves(String s) {
        int count=0;
        for (int i = 0; i < s.length();) {
            if(s.charAt(i) == 'X'){
                i+= 3;
                count++;
            }else {
                i++;
            }
        }
        return count;
    }
}
