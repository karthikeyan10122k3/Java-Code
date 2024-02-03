package com.kar.practice.exercise.numbers.src;

public class PrefectSquare {
    public static void main(String[] args) {
        int num1=49;
        int num2=62;
        isPerfectSquare(num1);
        isPerfectSquare(num2);
    }
    public static void isPerfectSquare(int num){
        int sq=(int)Math.sqrt(num);
        if((sq*sq)==num){
            System.out.println("Number is a Prefect Square");
        }
        else{
            System.out.println("Number is Not a Prefect Square");
        }
    }
    }

