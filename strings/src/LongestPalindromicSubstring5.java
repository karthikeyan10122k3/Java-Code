package com.kar.practice.exercise.strings.src;

public class LongestPalindromicSubstring5 {
    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }
    public static String longestPalindrome(String s) {
        if (s.length() <=1){
            return s;
        }
        int startIndex = 0;
        int endIndex = 0;

        for (int i = 0; i < s.length() - 1; i++) {
            int oddLength = isPalindrome(s,i,i);
            int evenLength = isPalindrome(s,i ,i+1);
            int maxLength = Math.max(oddLength,evenLength);
            if (maxLength > endIndex - startIndex){
                startIndex = i - ((maxLength - 1) /2);
                endIndex = i + (maxLength / 2);
            }
        }

        return s.substring(startIndex, endIndex + 1);
    }

    private static int isPalindrome(String s, int l, int r) {

        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)){
            l--;
            r++;
        }
        return r - l - 1;
    }
}
