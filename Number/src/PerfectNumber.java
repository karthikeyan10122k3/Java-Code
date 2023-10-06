package com.kar.practice.exercise.Number.src;

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
