package com.kar.practice.exercise.strings;

public class TimeConversion {
    public static void main(String[] args) {
        String s="10:59:59Pm";
        timeConversion(s);
     }
    public static void timeConversion(String s) {
        String portion = s.substring(0,8);
        String[] times = portion.split(":");
        if(s.charAt(8)=='P'){

            if(times[0].matches("12")){
                return;
            }
            times[0] = String.valueOf(Integer.valueOf(times[0]) + 12);
        }else{
            if(times[0].matches("12")){
                times[0]= "00";
            }
        }
    }
}
