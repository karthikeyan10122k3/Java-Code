package com.kar.practice.exercise.Array.src;

import java.util.Scanner;

public class DivisibleSumPairs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Element in array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter number to check Divisible Sum Pairs : ");
        int k = sc.nextInt();
        System.out.println("Enter Element of array : ");
        for (int i = 0; i <n-1; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Number of Divisible Pair is : "+divisibleSumPairCount(n, k, arr));
    }
    public static int divisibleSumPairCount(int n ,int k, int[] arr){
        int count = 0;
        for (int i = 0; i < n-1; i++) {
            for (int j = i+1; j < n; j++) {
                int addition = arr[i]+arr[j];
                if(addition % k == 0){
                    count++;
                }
            }
        }
        return count;
    }
}
