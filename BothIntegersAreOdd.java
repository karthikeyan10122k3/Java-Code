package com.kar.practice.exercise;

import java.util.Scanner;

public class BothIntegersAreOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        CheckIntegerOdd obj = new CheckIntegerOdd();
        System.out.println(obj.Check(num1, num2));


    }
}

