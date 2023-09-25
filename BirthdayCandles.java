package com.kar.practice.exercise;

public class BirthdayCandles {
    public static void main(String[] args) {
        int[] candles = {1, 9, 3, 4, 5, 9, 7, 8, 9};
        int result = birthdayCakeCandles(candles);
        System.out.println("Number of tallest candles: " + result);
    }

    public static int birthdayCakeCandles(int[] candles) {
        int max = 0;
        int count = 0;

        for (int i = 0; i < candles.length; i++) {
            if (candles[i] > max) {
                max = candles[i];
            }
        }

        for (int k = 0; k < candles.length; k++) {
            if (candles[k] == max) {
                count++;
            }
        }

        return count;
    }
}
