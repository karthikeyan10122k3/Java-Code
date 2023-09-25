package com.kar.practice.exercise;

import java.util.Scanner;

public class BothIntegerAreEven {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        CheckIntegerEven obj = new CheckIntegerEven();
        System.out.println(obj.Check(num1, num2));


    }
}

