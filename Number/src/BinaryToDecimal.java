package com.kar.practice.exercise.Number.src;

public class BinaryToDecimal {
    public static void main(String[] args) {
        int binaryNumber=111111;

        //Method 1 : Using Integer.parseInt()
        int decimalNumberForParseInt = Integer.parseInt(String.valueOf(binaryNumber),2);
        System.out.println(decimalNumberForParseInt);

        // Method 2 : Using While Loop
        int decimalNumberForWhile=0,digit,power=0;
        while (binaryNumber > 0) {
            digit=binaryNumber%10;
            decimalNumberForWhile+=digit*Math.pow(2,power);
            binaryNumber/=10;
            power++;
        }
        System.out.println(decimalNumberForWhile);
    }
}
