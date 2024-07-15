package com.kar.practice.exercise.strings.src;

public class LongestSubstringWithoutRepeatingCharacters3 {
    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        StringBuilder str = new StringBuilder();
        int maxLength = 0;

        for (char ch: s.toCharArray()){
            if (str.indexOf(String.valueOf(ch)) != -1){
                str = new StringBuilder(str.substring(str.indexOf(String.valueOf(ch))+1));
                str.append(ch);
            }else {
                str.append(ch);
            }
            maxLength = Math.max(str.length(),maxLength);

        }
        return maxLength;


    }
}
