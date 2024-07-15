package com.kar.practice.exercise.arrays.src;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        int[] nums =  {2, 3, 1, 2, 4, 3};
        int target = 7;
        System.out.println(minSubArrayLen(target,nums));
    }

    public static int minSubArrayLen(int target, int[] nums) {

        int i = 0, j = 0, wind = 0, min = Integer.MAX_VALUE;

        while (i < nums.length) {
            wind += nums[i];
            while (wind >= target) {
                min = Math.min(min, i - j + 1);
                wind -= nums[j];
                j++;
            }
            i++;
        }

        return (min == Integer.MAX_VALUE) ? 0 : min;

    }
}
