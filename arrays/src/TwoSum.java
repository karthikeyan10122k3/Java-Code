package com.kar.practice.exercise.arrays.src;

import java.util.ArrayList;
import java.util.List;

public class TwoSum {
    public static void main(String[] args) {
        int[] inputArray = {2,7,11,15};
        int target = 9;
        System.out.println(twoSumCalculator(inputArray, target));
    }

    private static int[] twoSumCalculator(int[] inputArray, int target) {
        ArrayList<Integer> array = new ArrayList<>();
        for (int i:inputArray) {
            array.add(i);
        }
        for (int i = 0; i < array.size(); i++) {
            int secondValue = target - array.get(i);

            if(array.contains(secondValue)){
                System.out.println(i +","+ array.indexOf(secondValue));
                return new int[]{i, array.indexOf(secondValue)};
            }
        }
        return new int[]{-1,-1};
    }

}
