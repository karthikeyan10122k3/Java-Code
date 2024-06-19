package com.kar.practice.exercise.numbers.src;

public class HumanReadableTime {
    public static void main(String[] args) {
        System.out.println(timeChange(2345));
        System.out.println(timeChange(3599990));
        System.out.println(timeChange(23452));

    }
    public static String timeChange(int seconds){

        if ((seconds>0)&&(seconds<400000)) {


            int hours = seconds / 3600;
            int remainingSeconds = seconds % 3600;
            int minutes = remainingSeconds / 60;
            int sec = remainingSeconds % 60;
            return String.format("%02d:%02d:%02d", hours, minutes, sec);
        }
        else {
            return "invalid input:Enter value Between 0 to 400000";
        }



    }
}
