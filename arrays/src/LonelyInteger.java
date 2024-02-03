package com.kar.practice.exercise.arrays.src;

import java.util.*;

public class LonelyInteger{
    public static void main(String[] args) {
        List<Integer> a = new ArrayList<>(Arrays.asList(1,2,3,4,3,2,1));
        System.out.println(lonelyinteger(a));
    }
    public static int lonelyinteger(List<Integer> a) {

        HashSet<Integer> dup = new HashSet<>();
        for (int i = 0; i < a.size(); i++) {
            dup.add(a.get(i));
        }

        List<Integer> list = new ArrayList<>(dup);

        for (int i = 0; i < dup.size(); i++) {
            int countOfIndividualElement = Collections.frequency(a, list.get(i));
            if(countOfIndividualElement==1){
                return list.get(i);
            }
        }
        return 0;
    }
}
