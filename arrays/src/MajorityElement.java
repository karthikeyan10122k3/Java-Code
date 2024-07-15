package com.kar.practice.exercise.arrays.src;

public class MajorityElement {
    public static void main(String[] args) {
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {

        int count = 0;
        int element = 0;

        for (int currNum: nums){

            if (count == 0){
                element = currNum;
            }

            if (currNum == element){
                count++;
            }else {
                count--;
            }
        }
        return element;
    }
}
