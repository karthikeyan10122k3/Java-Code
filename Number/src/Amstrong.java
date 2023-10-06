package com.kar.practice.exercise.Number.src;

import java.util.Scanner;

public class Amstrong {
    public static boolean armstrong(int x){
        int n,r = 0,d = 0;
        n=x;
        while(n>0){
            r=n%10;
            d+=(Math.pow(r,3));
            n/=10;

        }
        if(x==d)
        {
            return true;
        }
        else{
            return false;
        }

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number:");
        int x=sc.nextInt();
        System.out.println(armstrong(x));

    }
}
