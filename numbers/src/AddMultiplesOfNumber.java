package com.kar.practice.exercise.numbers.src;

import java.util.HashSet;
import java.util.Scanner;

public class AddMultiplesOfNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        HashSet<Integer> list1= MultiThreeAndFive(n);
        System.out.println(list1);
        int TotList=addArray(list1);
        System.out.println(TotList);
        }



    public static HashSet<Integer> MultiThreeAndFive(int n){
        HashSet<Integer> divisibleNumbers = new HashSet<>();

        for (int num = 1; num <= n; num++) {
            if (num % 3 == 0 || num % 5 == 0) {
                divisibleNumbers.add(num);
            }
        }
        return divisibleNumbers;
    }
    public static int addArray(HashSet<Integer> TotList){
        int sum=0;
        for (Integer num : TotList) {
            sum +=num;
        }
        return sum;

    }
}






