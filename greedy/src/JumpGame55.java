package com.kar.practice.exercise.greedy.src;

public class JumpGame55 {
    public static void main(String[] args) {
        int[] nums = {3, 2, 1, 1, 4};
//      positions  = {0, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(canJump(nums));
    }
    public static boolean canJump(int[] nums) {
        int goal = nums.length - 1;
        int currIndex = goal - 1;

        while (goal > 0 && currIndex != -1){
            if(currIndex + nums[currIndex] >= goal){
                goal = currIndex;
                currIndex = goal - 1;
            }else {
                currIndex--;
            }

        }
        return goal == 0;
    }
}
