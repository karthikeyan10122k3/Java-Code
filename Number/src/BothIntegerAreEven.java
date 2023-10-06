package com.kar.practice.exercise.Number.src;

import java.util.Scanner;

public class BothIntegerAreEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println(Check(num1, num2));


    }
    public static boolean Check(int a, int b) {
        if (a % 2 == 0 && b % 2 == 0) {
            return true;
        } else {
            return false;
        }


    }
}

