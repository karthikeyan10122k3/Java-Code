package com.kar.practice.exercise.DataStructure.src.Recursion.Array;

import java.util.Scanner;

public class LargestElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of element: ");
        int length = sc.nextInt();
        int[] inputArray = new int[length];
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < length; i++) {
            inputArray[i] = sc.nextInt();
        }
        int index = 0;
        int max = inputArray[0];


        System.out.println("Largest Element In Array is: "+largestElementInArray(inputArray,index,max));
    }

    private static int largestElementInArray(int[] inputArray, int index, int max) {

        if(index == inputArray.length - 1){
        return max;
        }

        if(inputArray[index] < inputArray[index+1]){
            return largestElementInArray(inputArray,index + 1,inputArray[index + 1]);
        }
        return largestElementInArray(inputArray,index + 1,max);
    }
}
