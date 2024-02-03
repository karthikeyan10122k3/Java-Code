package com.kar.practice.exercise.arrays.src;

import java.util.Arrays;

public class PermutingTwoArrays {
    public static void main(String[] args) {
        int[] A = {2, 1, 3};
        int[] B = {7, 8, 9};
        int k = 10;
        System.out.print(twoArrays(k,A,B));
    }
    public static String twoArrays(int k, int[] A, int[] B) {
        Arrays.sort(A);
        Arrays.sort(B);

        for (int start = 0, end = B.length - 1; start < end; start++, end--) {
            int temp = B[start];
            B[start] = B[end];
            B[end] = temp;
        }
        System.out.println(Arrays.toString(A));
        System.out.println(Arrays.toString(B));

        for (int i = 0; i < A.length; i++) {
            if ((A[i] + B[i]) < k){
                return "NO";
            }
        }
        return "YES";

    }
}
