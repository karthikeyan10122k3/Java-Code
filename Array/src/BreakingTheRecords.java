package com.kar.practice.exercise.Array.src;

import java.util.Scanner;

public class BreakingTheRecords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of Games : ");
        int n = sc.nextInt();
        int[] scores = new int[n];
        System.out.println("Enter the scores of each Game : ");
        for (int i = 0; i <n-1; i++){
            scores[i] = sc.nextInt();
        }
        BreakingTheRecordsCount(scores);
    }
    public static void BreakingTheRecordsCount(int[] scores){
        int max = scores[0];
        int maxCount = 0;
        int min = scores[0];
        int minCount = 0;;
        for (int i = 1; i < scores.length; i++) {
            if (scores[i]>max) {
                maxCount++;
                max = scores[i];
            }
            if (scores[i]<min) {
                minCount++;
                min = scores[i];
            }
        }
        System.out.println("Highest Score: "+maxCount+" Lowest Score : "+minCount);
    }
}
