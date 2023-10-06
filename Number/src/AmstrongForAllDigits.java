package com.kar.practice.exercise.Number.src;

import java.util.Scanner;

public class AmstrongForAllDigits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a Number:");
        int number= sc.nextInt();
        int length= Integer.toString(number).length();
        System.out.println(length);
        AmstrongFinder(number,length);
    }
    public static void AmstrongFinder(int num,int length){
        int sum=0;
        int temp = num;
        while (num != 0) {
            int rem = num % 10;
            sum += Math.pow(rem, length);
            num /= 10;
        }
        if (temp == sum) {
            System.out.println("It is an Armstrong Number ");
        } else {
            System.out.println("It is not an Armstrong Number");
        }

    }
}
