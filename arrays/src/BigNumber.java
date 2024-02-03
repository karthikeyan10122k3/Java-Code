package com.kar.practice.exercise.arrays.src;

import java.math.BigDecimal;
import java.util.Scanner;

public class BigNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        String []s=new String[n];
        for(int i=0;i<n;i++){
            s[i]=sc.next();
        }

        for (int i = n - 1; i >= 0; i--) {
            for (int j = n - 1; j >= i + 1; j--) {
                BigDecimal num1 = new BigDecimal(s[i]);
                BigDecimal num2 = new BigDecimal(s[j]);
                if (num2.compareTo(num1) > 0) {
                    String temp = s[i];
                    s[i] = s[j];
                    s[j] = temp;
                } else if (num2.compareTo(num1) == 0) {
                    if (num2.toString().length() < num1.toString().length()) {
                        String temp = s[i];
                        s[i] = s[j];
                        s[j] = temp;
                    }
                }
            }
        }
        System.out.println(s.toString());

    }
}


//    Sample Input:
//
//        9 = length
//        -100
//        50
//        0
//        56.6
//        90
//        0.12
//        .12
//        02.34
//        000.000

//        Sample Output:
//
//        90
//        56.6
//        50
//        02.34
//        0.12
//        .12
//        0
//        000.000
//        -100
