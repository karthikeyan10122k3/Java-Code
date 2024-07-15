package com.kar.practice.exercise.arrays.src;

public class SingleNumber {
    public static void main(String[] args) {
        int[] arr= {4,2,2,3,1,1,4};

        System.out.println(singleNumber(arr));
    }

    public static int singleNumber(int[] nums) {
        int result = 0;
        for (int num : nums){
            result = num ^ result;
        }
        return result;
    }
}
