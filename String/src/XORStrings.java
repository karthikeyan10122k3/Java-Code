package com.kar.practice.exercise.String.src;

public class XORStrings {
    public static void main(String[] args) {
        String a = "10101";
        String b = "00101";
        String result = "";
        for (int i = 0; i < a.length(); i++) {
            if ((a.charAt(i)==b.charAt(i))){
                result +="0";
                continue;
            }
            result +="1";
        }
        System.out.println(result);
    }
}
