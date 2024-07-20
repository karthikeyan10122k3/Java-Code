package com.kar.practice.exercise.arrays.src;

//https://leetcode.com/problems/container-with-most-water/description/

public class ContainerWithMostWater11 {
    public static void main(String[] args) {
        int[] height = {1,1};
//                     {0, 1, 2, 3, 4, 5, 6, 7, 8};

        System.out.println(maxArea(height));
    }
    public static int maxArea(int[] height) {
        int maxArea = Integer.MIN_VALUE;
        int currArea ;
        int i = 0;
        int j = height.length - 1;

        while (i<j){
            int h = Math.min(height[i],height[j]);
            int b = j - i;
            currArea = h * b;
            maxArea = Math.max(currArea,maxArea);
            if(height[i] < height[j]){
                i++;
            }else {
                j--;
            }
        }
        return maxArea;
    }
}
