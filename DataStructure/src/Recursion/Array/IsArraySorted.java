package com.kar.practice.exercise.DataStructure.src.Recursion.Array;

import java.util.Scanner;

public class IsArraySorted {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of element: ");
        int length = sc.nextInt();
        int[] inputArray = new int[length];
        System.out.println("Enter the Elements of Array: ");
        for (int i = 0; i < length; i++) {
            inputArray[i] = sc.nextInt();
        }

        System.out.println(isArraySorted(inputArray,0));
    }

    private static boolean isArraySorted(int[] inputArray, int index) {

        if (index == inputArray.length - 1){
            return true;
        }

        return (inputArray[index] < inputArray[index +1]) && isArraySorted(inputArray,index+1);
    }
}
