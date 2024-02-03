package com.kar.practice.exercise.numbers.src;

import java.util.Scanner;

public class WhichQuadrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter X-Axis: ");
        int xAxis = sc.nextInt();
        System.out.print("Enter Y-Axis: ");
        int yAxis = sc.nextInt();

        if (xAxis > 0 && yAxis > 0){
            System.out.println("First Quadrant!");
        }
        else if (xAxis < 0 && yAxis > 0){
            System.out.println("Second Quadrant!");
        }
        else if (xAxis < 0 && yAxis < 0){
            System.out.println("Third Quadrant!");
        }
        else if(xAxis > 0 && yAxis < 0){
            System.out.println("Fourth Quadrant!");
        }
        else if(xAxis == 0 && yAxis == 0){
            System.out.println("Origin!");
        }
        else if(yAxis == 0){
            System.out.println("On X-axis!");
        }
        else {
            System.out.println("On Y-axis!");
        }


    }
}
