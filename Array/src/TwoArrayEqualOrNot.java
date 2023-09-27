package com.kar.practice.exercise;

import java.util.Arrays;
import java.util.Scanner;

import static com.kar.practice.exercise.CheckArrayEqual.*;


class CheckArrayEqual {
    public static boolean check(int[] a,int[] b ) {

       Arrays.sort(a);
       Arrays.sort(b);
        return Arrays.equals(a, b);
    }

}

public class TwoArrayEqualOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CheckArrayEqual obj = new CheckArrayEqual();
        System.out.println("enter no of element:");
        int n=sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        System.out.println("enter elements of a:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("enter elements of b:");
        for(int i=0;i<n;i++){
            b[i]=sc.nextInt();
        }

        System.out.println(check(a,b));

        }
}
