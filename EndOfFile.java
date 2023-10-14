package com.kar.practice.exercise;

import java.util.Scanner;

//To Checks Number of Lines of Inputs

public class EndOfFile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int lineNumber = 0;

        while (sc.hasNext()) {
            String line = sc.nextLine();
            lineNumber++;
            System.out.println(lineNumber + " " + line);
        }

    }
}
