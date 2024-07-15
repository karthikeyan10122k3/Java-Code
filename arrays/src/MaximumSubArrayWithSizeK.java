package com.kar.practice.exercise.arrays.src;

public class MaximumSubArrayWithSizeK {
    public static void main(String[] args){
        int[] nums = {2,9,31,-4,21,-7};
        int k = 3;
        System.out.println(maxSubArraySum(nums,k));
    }

    private static int maxSubArraySum(int[] nums,int k) {

        int windowSum = 0;
        int MaxSum = Integer.MIN_VALUE;
        int i = 0;
        if (nums.length > k){
            windowSum = nums[i] + nums[i + 1] + nums[i + 2];
        }

        for (int j = k; j < nums.length ; j++) {
            windowSum = windowSum - nums[ j - k ] + nums[ j ];
            MaxSum = Math.max(MaxSum,windowSum);
        }
        return MaxSum;
    }


}
