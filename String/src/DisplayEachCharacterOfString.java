package com.kar.practice.exercise.String.src;

public class DisplayEachCharacterOfString {
    public static void main(String[] args) {
        characterDisplay();
    }
    public static void characterDisplay(){
        String str="karthikeyan R";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));


        }

    }
}
