package com.kar.practice.exercise.DataStructure.src.Recursion.String;

import java.util.ArrayList;
import java.util.Scanner;

public class Permutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String: ");
        String inputString = "abc";

        ArrayList<String> p = new ArrayList<>();
        ArrayList<String> permutation = permutationReturn("",inputString,p);
        System.out.println(permutation);

        permutation("","abc");
    }

    private static void permutation(String processing, String inputString) {
        if (inputString.isEmpty()){
            System.out.println(processing);
            return;
        }

        char characterToProcess = inputString.charAt(0);

        for (int i = 0; i <= processing.length() ; i++) {
            String firstHalf = processing.substring(0,i);
            String secondHalf = processing.substring(i);

            permutation(firstHalf + characterToProcess + secondHalf,inputString.substring(1));

        }
    }

    private static ArrayList<String> permutationReturn(String processing, String inputString , ArrayList<String> p) {

        if (inputString.isEmpty()){
            p.add(processing);
            return p;

        }

        char characterInProcess = inputString.charAt(0);

        for (int i = 0; i <= processing.length() ; i++) {
            String firstHalf = processing.substring(0,i);
            String secondHalf = processing.substring(i);

            permutationReturn(firstHalf + characterInProcess + secondHalf,inputString.substring(1),p);
        }
        return p;
    }
}
