package com.kar.practice.exercise.strings.src;

import java.util.Arrays;

public class IsIPv4Address {
    public static void main(String[] args) {
        String inputString = "129380129831213981.255.255.255";
        System.out.println(solution(inputString));
    }

    private static boolean solution(String inputString) {
        String[] subnet = inputString.split("\\.");
        System.out.println(Arrays.toString(subnet));

        if (subnet.length != 4){
            return false;
        }
        for (String str:subnet) {
            if (str.length() > 3) {
                return false;
            } else if (str.isEmpty()){
                return false;
            } else if (str.matches(".*[a-z].*")) {
                return false;
            } else if (str.length() > 1 && str.startsWith("0")) {
                return false;
            }
            int integerStr = Integer.parseInt(str);
            System.out.println(integerStr);
            if (integerStr < 0 || integerStr > 255){
                return false;
            }

        }
        return true;

    }
}
