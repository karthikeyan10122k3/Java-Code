package com.kar.practice.exercise.DataStructure.src.Recursion.String;

import java.util.Scanner;

public class SubSequences {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no of element: ");
        String inputString = sc.nextLine();
        String subSequences= "";

        printSubSequences(subSequences,inputString);
    }

    private static void printSubSequences(String subSequences, String inputString) {

        if(inputString.isEmpty()){
            System.out.println(subSequences);
            return;
        }
        char ch = inputString.charAt(0);

        printSubSequences(subSequences,inputString.substring(1));
        printSubSequences(subSequences + ch,inputString.substring(1));

    }
}
