package com.kar.practice.exercise.arrays.src;

import java.util.*;

public class MissingNumbers {
    public static void main(String[] args) {
        List<Integer> list1 = Arrays.asList(11, 4, 11, 7, 13, 4 ,12 ,11, 10 ,14);
        List<Integer> list2 = Arrays.asList(11 ,4 ,11 ,7 ,3 ,7 ,10 ,13 ,4 ,8 ,12 ,11 ,10 ,14 ,12);

        System.out.println(findMissingNumbers(list1,list2));

    }

    private static List<Integer> findMissingNumbers(List<Integer> array1, List<Integer> array2) {
        TreeMap<Integer,Integer> elementCounter1 = new TreeMap<>();
        TreeMap<Integer,Integer> elementCounter2 = new TreeMap<>();
        List<Integer> missingElements = new ArrayList<>();

        int length1 = array1.size();
        int length2 = array2.size();


        if(length1 == length2){
            return missingElements;
        }

        for (int element1 : array1) {
               elementCounter1.put( element1, elementCounter1.getOrDefault(element1, 0) + 1);
        }
        System.out.println(elementCounter1);
        for (int element2 : array2) {
                elementCounter2.put( element2, elementCounter2.getOrDefault(element2, 0) + 1);

        }
        System.out.println(elementCounter2);


        for (Integer key: elementCounter2.keySet()) {
            if(!elementCounter1.getOrDefault(key, 0).equals(elementCounter2.getOrDefault(key, 0))){
                missingElements.add(key);
            }
        }
        return missingElements;

    }
}
