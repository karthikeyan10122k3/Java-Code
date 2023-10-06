package com.kar.practice.exercise.Number.src;

import java.util.Scanner;

public class Palindrome {
    public static Boolean palindrome(int x)
    {
        int n,r = 0,d = 0;
        n=x;
        while(x>0){
            r=x%10;
            d=(d*10)+r;
            x=x/10;

        }
        System.out.println(d);
        if(n==d)
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
//        int x=sc.nextInt();
        System.out.println(palindrome(121));

    }
}
