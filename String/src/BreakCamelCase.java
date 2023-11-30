package com.kar.practice.exercise.String.src;

public class BreakCamelCase{
    public static void main(String[] args) {
        System.out.println(breakCase("camelCasing"));
        System.out.println(newBreakCaseMethod("abdulAfshit"));
    }
    public static String newBreakCaseMethod(String str){
        return str.replaceAll("([A-Z])", " $1");


    }
    public static String breakCase(String str){
        String newString="";
        for (int i = 0; i < str.length(); i++) {
            if(Character.isUpperCase(str.charAt(i))) {
                newString+=" ";
            }
            newString+=String.valueOf(str.charAt(i));

        }
        return newString;
    }




}
