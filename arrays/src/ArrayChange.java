package com.kar.practice.exercise.arrays.src;


import java.util.Arrays;

public class ArrayChange {
    public static void main(String[] args) {
       int[] inputArray = {1, 1, 1};
        System.out.println(arrayChangeCkeck(inputArray));
    }

    private static int arrayChangeCkeck(int[] inputArray) {
        int moves = 0;
        for(int i=0;i<inputArray.length -1;i++){
            System.out.println("Loop :"+i);
            if(inputArray[i] >= inputArray[i+1]){
                int difference = inputArray[i] - inputArray[i+1] + 1 ;
                System.out.println(difference);
                moves += difference;
                System.out.println(moves);
                inputArray[i+1] += difference;
                System.out.println(Arrays.toString(inputArray));
            }

            System.out.println(moves);

        }
        return moves;
    }
}
