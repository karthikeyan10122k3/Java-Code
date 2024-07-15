package com.kar.practice.exercise.arrays.src;

public class MaximumSubArray53 {
    public static void main(String[] args) {
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};
        System.out.println(maxSubArray(nums));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum = nums[0];
        int currSum = nums[0];
        for(int i=1;i<nums.length;i++){
            if (currSum >= 0){
                currSum += nums[i];
            }else{
                currSum = nums[i];
            }

            maxSum = Math.max(currSum,maxSum);
        }
        return maxSum;
    }
}
