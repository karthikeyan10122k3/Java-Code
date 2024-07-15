package com.kar.practice.exercise.strings.src;

import java.util.Stack;

public class MaximumScoreFromRemovingSubstrings1717 {
    public static void main(String[] args) {
        String s = "cbaabwbbbabbwaaq";
        int x = 4074, y = 9819;
        System.out.println(maximumGain(s,x,y));
    }

    public static int maximumGain(String s, int x, int y) {
        int maxVal = Math.max(x, y);
        int minVal = (maxVal == x) ? y : x;
        String maxValueString = (maxVal == x) ? "ab" : "ba";

        int sum = 0;

        Stack<Character> s1 = new Stack<>();
        Stack<Character> s2 = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == maxValueString.charAt(1) && !s1.isEmpty() && s1.peek() == maxValueString.charAt(0)){
                sum += maxVal;
                s1.pop();
            }else {
                s1.push(ch);
            }
        }

        while (!s1.isEmpty()){
            char ch = s1.pop();
            if (ch == maxValueString.charAt(1) &&
                    !s2.isEmpty() &&
                    s2.peek() == maxValueString.charAt(0)){
                sum += minVal;
                s2.pop();
            }else {
                s2.push(ch);
            }
        }

        return sum;
    }

}
