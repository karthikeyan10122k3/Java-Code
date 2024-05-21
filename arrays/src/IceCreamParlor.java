package com.kar.practice.exercise.arrays.src;

import java.util.*;

public class IceCreamParlor {
    public static void main(String[] args) {
        List<Integer> flavourCosts = Arrays.asList(1, 4, 5, 3, 2);
        int totalCost = 4;
        System.out.println(iceCreamParlor(totalCost, flavourCosts));
    }

    private static List<Integer> iceCreamParlor(int m, List<Integer> arr) {
        List<Integer> indexCost = new ArrayList<>();
        HashMap<Integer, Integer> costMap = new HashMap<>();

        for (int i = 0; i < arr.size(); i++) {
            int currentCost = arr.get(i);
            int complement = m - currentCost;

            if (costMap.containsKey(complement)) {
                indexCost.add(costMap.get(complement) + 1);
                indexCost.add(i + 1);
                return indexCost;
            }

            costMap.put(currentCost, i);
        }

        return indexCost;
    }
}
