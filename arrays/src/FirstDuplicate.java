package com.kar.practice.exercise.arrays.src;

import java.util.HashMap;
import java.util.Map;

public class FirstDuplicate {
    public static void main(String[] args) {
        int[] a = {1, 1, 2, 2, 1};
        System.out.println(solution(a));
    }

    private static int solution(int[] a) {

        Map<Integer,Integer> mapIndex = new HashMap<>(); //element , dupIndex
        for (int i = 0; i < a.length-1; i++) {
            for (int j = i + 1; j < a.length; j++) {

                if (!mapIndex.containsKey(a[i])){
                    if (a[i] == a[j]){
                        mapIndex.put(a[i],j);
                    }
                }
            }
        }
        int smallestValue = Integer.MAX_VALUE;
        int smallestKey = -1;

        for (Map.Entry<Integer, Integer> entry : mapIndex.entrySet()) {
            System.out.println(entry);
            int key = entry.getKey();
            int value = entry.getValue();

            if (value < smallestValue) {
                smallestValue = value;
                smallestKey = key;
            }
        }

        if (smallestKey != -1) {
            return smallestKey;
        } else {
            return -1;
        }
    }
}
