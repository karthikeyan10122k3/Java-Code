package com.kar.practice.exercise.arrays.src;

import java.util.*;

public class LonelyInteger{
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));
        System.out.println(lonelyInteger(a));
    }
    public static int lonelyInteger(List<Integer> a) {

        HashSet<Integer> dup = new HashSet<>(a);

        for (int i = 0; i < dup.size(); i++) {
            int countOfIndividualElement = Collections.frequency(a, a.get(i));
            if(countOfIndividualElement==1){
                return a.get(i);
            }
        }
        return 0;
    }
}
