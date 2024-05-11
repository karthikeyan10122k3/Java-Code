package com.kar.practice.exercise.strings.src;

public class ReverseInParentheses {
    public static void main(String[] args) {
        String inputString = "(damm)(bar)";
//        solution(inputString);
        System.out.println(solution(inputString));

    }

    private static String solution(String inputString) {
        int firstIndex = inputString.lastIndexOf("(");
        int lastIndex = inputString.indexOf(")",firstIndex);

        while (firstIndex != -1){
            String reversedSubString =new StringBuilder(inputString.substring(firstIndex+1,lastIndex)).reverse().toString();
            String firstHalf = inputString.substring(0, firstIndex);
            String secondHalf = inputString.substring(lastIndex + 1);
            inputString = firstHalf + reversedSubString + secondHalf;
            firstIndex = inputString.lastIndexOf("(");
            lastIndex = inputString.indexOf(")",firstIndex);
        }
        return inputString;

    }
}
