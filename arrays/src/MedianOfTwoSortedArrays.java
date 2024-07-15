package com.kar.practice.exercise.arrays.src;

import java.util.Arrays;
import java.util.Scanner;

public class MedianOfTwoSortedArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Array 1
        System.out.print("Enter no of element in Array 1: ");
        int length1 = sc.nextInt();
        int[] inputArray1 = new int[length1];
        System.out.println("Enter the Elements of Array 1: ");
        for (int i = 0; i < length1; i++) {
            inputArray1[i] = sc.nextInt();
        }

        //Array 2
        System.out.print("Enter no of element in Array 2: ");
        int length2 = sc.nextInt();
        int[] inputArray2 = new int[length2];
        System.out.println("Enter the Elements of Array 2: ");
        for (int i = 0; i < length2; i++) {
            inputArray2[i] = sc.nextInt();
        }

        System.out.println(findMedianSortedArrays(inputArray1,inputArray2));
//        findMedianSortedArrays(inputArray1,inputArray2);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0;
        int j = 0;
        int k = 0;
        int[] mergedArray = new int[nums1.length + nums2.length];

        while(i <= nums1.length - 1 && j <= nums2.length - 1){
            if(nums1[i] < nums2[j]){
                mergedArray[k] = nums1[i];
                i++;
            }else {
                mergedArray[k] = nums2[j];
                j++;
            }
            k++;
        }

        if (i < nums1.length){
            for (int l = i ; l < nums1.length; l++) {
                mergedArray[k] = nums1[l];
                k++;
            }
        }

        if (j < nums2.length){
            for (int l = j ; l < nums2.length; l++) {
                mergedArray[k] = nums2[l];
                k++;
            }
        }
        int low = 0;
        int high = mergedArray.length;


        int midIndex = (low +  high) / 2;

        if (mergedArray.length % 2 == 0){
            return (double) (mergedArray[midIndex] + mergedArray[midIndex - 1]) /2;
        }else {
            return (double) mergedArray[midIndex];
        }

    }
}
