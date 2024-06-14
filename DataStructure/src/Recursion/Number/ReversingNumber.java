package com.kar.practice.exercise.DataStructure.src.Recursion.Number;

import java.util.Scanner;

public class ReversingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int inputNumber = sc.nextInt();


        reversingNumber(inputNumber);
    }

    private static void reversingNumber(int inputNumber) {


        if(inputNumber != 0){
            int remainder = inputNumber % 10;
            System.out.print(remainder);
            reversingNumber(inputNumber / 10);
        }

    }
}
