package com.kar.practice.exercise.arrays.src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AngryProfessor {
    public static <integer> void main(String[] args) {
        List<Integer> arrivalTime = new ArrayList<>(Arrays.asList(0 ,-1, 2, 1));
        int threshold = 2;
        System.out.print(angryProfessor(threshold, arrivalTime ));
    }
    public static String angryProfessor(int k, List<Integer> a) {
        int count=0;
        for (int i = 0; i < a.size()-1; i++) {
            if (a.get(i)<=0){
                count++;
                if (count >= k){
                    return "NO";
                }
            }
        }
        return "YES";
    }
}
