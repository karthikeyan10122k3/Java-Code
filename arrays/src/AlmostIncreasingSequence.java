package com.kar.practice.exercise.arrays.src;

import java.util.*;

public class AlmostIncreasingSequence {
    public static void main(String[] args) {
        int[] sequence = {1, 2, 3, 4, 99, 5, 6};
        String result = solution(sequence) ? "True" : "False";
        System.out.println(result);
    }

    public static boolean solution(int[] sequence) {
        ArrayList<Integer> sequenceAsArrayList = new ArrayList<>();
        for (int j : sequence) {
            sequenceAsArrayList.add(j);
        }

        System.out.println("Original sequence: " + sequenceAsArrayList);

        int count = 0;
        for (int i = 0; i < sequenceAsArrayList.size()-1; i++) {
            System.out.println("i: "+i);
            if (sequenceAsArrayList.get(i+1) <= sequenceAsArrayList.get(i) ) {
                count++;
                if(i > 0 && sequenceAsArrayList.get(i-1) >= sequenceAsArrayList.get(i+1)){
                    sequenceAsArrayList.remove(i+1);
                }
                else {
                    sequenceAsArrayList.remove(i);
                }

                System.out.println("removed sequence(" + i + "):" + sequenceAsArrayList);
                i = -1;

                if (count > 1) {
                    return false;
                }
            }
        }
        return true;
    }
}
