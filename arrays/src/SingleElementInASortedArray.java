package com.kar.practice.exercise.arrays.src;

import java.util.HashMap;
import java.util.TreeMap;

public class SingleElementInASortedArray {

    public static void main(String[] args) {

        int[] nums = {1,1,2,2,3,4,4,8,8};
        System.out.println(singleNonDuplicate(nums));
    }

        public static int singleNonDuplicate(int[] nums) {

            HashMap<Integer,Integer> count = new HashMap<>();
            for (int i:
                 nums) {
                count.put(i,count.getOrDefault(i,0)+1);
            }
            for (int counter:
                 count.keySet()) {
                if(count.get(counter)==1){
                    return counter;
                }
            }


            return 0;
        }
    }
