package com.kar.practice.exercise.DataStructure.src.Recursion.String;

import java.util.Scanner;

public class LengthOfString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of element: ");
        String inputString = sc.nextLine();

        int length = 0;
        System.out.println(lengthOfString(inputString,length));
    }

    private static int lengthOfString(String inputString,int length) {

        if (inputString.isEmpty()) {
            return 0;
        } else {
            return  1 + lengthOfString(inputString.substring(1),length);
        }
    }
}
