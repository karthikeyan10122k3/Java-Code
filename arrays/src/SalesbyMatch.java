package com.kar.practice.exercise.arrays.src;

import java.util.*;

public class SalesbyMatch {
    public static void main(String[] args) {
        List<Integer> socks = new ArrayList<>(Arrays.asList(10 ,20 ,20 ,10 ,10 ,30 ,50 ,10 ,20));
        int noOfStock = socks.size();
        System.out.println(sockMerchant(noOfStock,socks));
    }
    public static int sockMerchant(int n, List<Integer> ar) {
        int noOfPairs =0;
        HashSet<Integer> dup = new HashSet<>();
        for (int i = 0; i < ar.size(); i++) {
            dup.add(ar.get(i));
        }
        List<Integer> list = new ArrayList<>(dup);
        for (int i = 0; i < dup.size(); i++) {
            int countOfIndividualElement = Collections.frequency(ar, list.get(i));
            noOfPairs += countOfIndividualElement/2;
        }

        return noOfPairs;
    }
}
