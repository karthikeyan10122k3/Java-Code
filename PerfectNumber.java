package com.kar.practice.exercise;

//Given an integer input as the number, the objective is to check whether the number
// can be represented as the sum of its factors except the number itself.
// Therefore, we write a code to Check Whether or Not a Number is a Perfect Number in Java Language.
//
//        Example
//        Input : 6
//        Output : Yes, it's a Perfect Number
//        Since, 6 = 1 + 2 + 3 (which are its divisors)

public class PerfectNumber {
    public static void main(String[] args) {
        int num= 6;
        int num1=10;
        isPerfectNumber(num);
        isPerfectNumber(num1);
    }
    public static void isPerfectNumber(int num){
        int sum=0;
        for (int i = 1; i < num; i++) {
            if(num%i==0){
                sum+=i;
            }

        }
        if(sum==num){
            System.out.println("Prefect Number");
        }
        else{
            System.out.println("Not a Prefect Number");
        }
    }

}
