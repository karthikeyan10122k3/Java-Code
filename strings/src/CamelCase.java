package com.kar.practice.exercise.strings.src;

import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter String :");
        String str = sc.nextLine();
        System.out.println("Number of Words in the CameCase is : "+countWords(str));
    }
    public static int countWords(String str){
        int count=1;
        for (int i = 1; i < str.length()-1; i++) {
            if(Character.isUpperCase(str.charAt(i))){
                count++;
            }

        }
        return count;
    }
}
