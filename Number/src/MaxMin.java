package com.kar.practice.exercise.Number.src;

import java.util.*;
import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter num or elements : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter elements : ");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        maxminCalculator(arr,n);
    }
    public static void maxminCalculator(int[] arr , int n){
        int minSum=0;
        int maxSum=0;
        Arrays.sort(arr);

        System.out.print("Sorted Elements : ");
        for (int element: arr) {
            System.out.print(element+" , ");
        }
        System.out.println();

        for (int i = 1; i < n; i++) {
            minSum+=arr[i];
        }
        for (int i = 0; i < n-1; i++) {
            maxSum+=arr[i];
        }
        System.out.println("Maximum Sum : "+ maxSum);
        System.out.println("Minimum Sum : "+ minSum);


    }
}
