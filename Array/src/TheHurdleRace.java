package com.kar.practice.exercise.Array.src;

public class TheHurdleRace {
    public static void main(String[] args) {
        //int numOfHurdles=5;
        int[] heightOfHurdles= {2,5,4,5,2};
        int heightCanJump=7;
        dosesRequired(heightOfHurdles,heightCanJump);

    }
    public static void dosesRequired(int[] heightOfHurdles,int heightCanJump){
        int max=0;
        for (int i = 0; i < heightOfHurdles.length; i++) {
            if(heightOfHurdles[i]>max){
                max=heightOfHurdles[i];
            }

        }
        if(heightCanJump<max){
            System.out.println(max-heightCanJump);
        }else {
            System.out.println("0");
        }

    }
}
