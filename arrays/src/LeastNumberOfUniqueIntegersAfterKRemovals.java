package com.kar.practice.exercise.arrays.src;

import java.util.Arrays;
import java.util.HashMap;
import java.util.TreeMap;

public class LeastNumberOfUniqueIntegersAfterKRemovals {
    public static void main(String[] args) {
        int[] arr = {4,3,1,1,3,3,2};
        int k = 3;
        System.out.println(findLeastNumOfUniqueInts(arr,k));
    }
    public static int findLeastNumOfUniqueInts(int[] arr, int k) {

        HashMap<Integer,Integer> frequency = new HashMap<>();
        for (int num: arr){
            frequency.put(num, frequency.getOrDefault(num, 0) + 1);
        }

        int[] freqArray = new int[frequency.size()];
        int i=0;
        for (int freq: frequency.values()){
            freqArray[i++] = freq;
        }
        Arrays.sort(freqArray);
        for (i = 0; i < freqArray.length; i++) {
            if (k<freqArray[i]){
                break;
            }
            k -= freqArray[i];
        }

        return freqArray.length - i;
    }
}
