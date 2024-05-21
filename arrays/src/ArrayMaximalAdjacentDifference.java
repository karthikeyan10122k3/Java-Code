package com.kar.practice.exercise.arrays.src;

public class ArrayMaximalAdjacentDifference {
    public static void main(String[] args) {
        int[] inputArray = {2, 4, 1, 0};
        System.out.println(solution(inputArray));
    }

    private static int solution(int[] inputArray) {
        int maxAbsolute = Integer.MIN_VALUE;


        for (int i = 0; i < inputArray.length - 1; i++) {
            int currentMax =Math.abs( inputArray[i] - inputArray[ i + 1 ]);
            if(currentMax > maxAbsolute){
                maxAbsolute = currentMax;
            }

        }
        return maxAbsolute;
    }
}
