package com.kar.practice.exercise.arrays.src;

import java.util.ArrayList;
import java.util.Scanner;


public class SubSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] inputArray = {1,2,3};


        ArrayList<ArrayList<Integer>> result = printSubset(inputArray);

        System.out.println(result);
    }


    private static ArrayList<ArrayList<Integer>> printSubset( int[] inputArray) {

        ArrayList<ArrayList<Integer>> outerList = new ArrayList<>();

        outerList.add(new ArrayList<>());

        for (int num: inputArray){
            int eachInternalListLength = outerList.size();
            for (int i = 0; i < eachInternalListLength; i++) {
                ArrayList<Integer> internalList = new ArrayList<>(outerList.get(i));
                internalList.add(num);
                outerList.add(internalList);
            }
        }
        return outerList;

    }


}
