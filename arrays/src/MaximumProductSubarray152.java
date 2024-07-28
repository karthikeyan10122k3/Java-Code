package com.kar.practice.exercise.arrays.src;

public class MaximumProductSubarray152 {
    public static void main(String[] args) {
        int[] nums = {0,10,10,10,10,10,10,10,10,10,-10,10,10,10,10,10,10,10,10,10,0};
        System.out.println(maxProduct(nums));
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = Integer.MIN_VALUE;
        int product = 1;
        for(int i = 0;i<nums.length;i++){
            for(int j = i;j<nums.length;j++){
                product *= nums[j];
                System.out.println("Product: "+product);
                if(product > maxProduct){
                    System.out.println("Max Product: "+maxProduct);
                    maxProduct = product;
                }
            }
            product = 1;
        }
        return maxProduct;
    }
}
