package com.kar.practice.exercise.Number.src;

import java.util.Scanner;

public class ReverseInteger {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an Integer:");
        int a=sc.nextInt();
        System.out.println(reverseInteger(a));
    }
    public  static int reverseInteger(int a){
        int r=0;
        int digit=0;
        int temp=a;
        while(temp!=0){
            r=temp%10;
            digit=digit*10+r;
            temp/=10;
        }
        return digit;
    }
}
