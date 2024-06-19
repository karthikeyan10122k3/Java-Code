package com.kar.practice.exercise.DataStructure.src;


import java.util.TreeSet;

public class ArrayUnion {
    public static void main(String[] args) {
        int[] arr1={1,3,4,5};
        int[] arr2={1,2,5,6,7,8,};
        TreeSet<Integer> result = new TreeSet<>();
        for (int j : arr1) {
            result.add(j);
        }
        for (int j : arr2) {
            result.add(j);
        }
        System.out.println(result);
    }




}
