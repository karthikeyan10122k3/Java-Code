package com.kar.practice.exercise.arrays.src;

import java.util.Arrays;

public class RearrangeArrayElementsBySign {
    public static void main(String[] args) {
        int[] nums = {3, 1, -2, -5, 2, -4};

        System.out.println(Arrays.toString(rearrangeArray(nums)));

    }
    public static int[] rearrangeArray(int[] nums) {
        int[] rearrangedArray = new int[nums.length];
        int positivePointer = 0;
        int negativePointer = 1;
        int numsParser = 0;

        while ( numsParser < nums.length ){
            if (nums[numsParser] > 0){
                rearrangedArray[positivePointer] = nums[numsParser];
                positivePointer += 2;
            }else {
                rearrangedArray[negativePointer] = nums[numsParser];
                negativePointer += 2;
            }
            numsParser++;
        }
        return rearrangedArray;
    }
}
