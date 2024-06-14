package com.kar.practice.exercise.DataStructure.src.Recursion.Number;

import java.util.Scanner;

public class PowerOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int inputNumber = sc.nextInt();

        System.out.print("Enter the Power: ");
        int power = sc.nextInt();


        System.out.println(powerOfNumber(inputNumber,power));
    }

    private static int powerOfNumber(int inputNumber, int power) {

        if (power == 1){
            return inputNumber;
        }

        return (inputNumber * powerOfNumber(inputNumber,power - 1));

    }
}
