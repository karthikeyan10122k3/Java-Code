package com.kar.practice.exercise.Array.src;

import java.util.Scanner;

public class DoubleArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements : ");
        int size1 = sc.nextInt();
        int[] array1 = new int[size1];
        System.out.println("Enter the elements : ");
        for (int i = 0; i < size1; i++) {
            array1[i]=sc.nextInt();
        }
        System.out.println("Original Array: ");
        for (int elements: array1
             ) {
            System.out.println(elements);

        }
        doubleArray(array1,size1);

    }
    public static void doubleArray(int[] array1,int size1){
        int size2 = size1*2;
        int[] array2 = new int[size2];
        for (int i = 0; i < size1; i++) {
            array2[i] = array1[i];

        }
        for (int i = size1; i < size2; i++) {
            array2[i] = array1[i];

        }
        System.out.println("Duplicate Array: ");

        for (int elements: array2
        ) {
            System.out.println(elements);

        }
    }
}
