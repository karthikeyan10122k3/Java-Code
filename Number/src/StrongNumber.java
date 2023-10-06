package com.kar.practice.exercise.Number.src;

import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int number = sc.nextInt();
        strongNumberCalculator(number);

    }
    public static void strongNumberCalculator(int number){

        int sum=0;
        int x=number;
        while(x!=0){
            int digit = x % 10;
            sum+=factorial(digit);
            x/=10;
        }
        if(sum == number){
            System.out.println("The given Number is Strong Number!");
        }
        else {
            System.out.println("The given Number is not Strong Number!");
        }

    }
    public static int factorial(int digit){
        if(digit == 0 || digit == 1){
            return 1;
        }
        else{
            return digit * factorial(digit - 1);
        }
    }

}
