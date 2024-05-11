package com.kar.practice.exercise.numbers.src;

public class IsLucky {
    public static void main(String[] args) {
        int number = 239017;
        System.out.println(solution(number));
//        solution(number);
    }

    private static boolean solution(int number) {
        String strNumber = String.valueOf(number);
        int length = strNumber.length();
        int middleIndex = length/2;
        int firstHalfSum = 0;
        int secondHalfSum = 0;

        for (int i = 0; i < middleIndex; i++) {
            firstHalfSum += Integer.parseInt(String.valueOf(strNumber.charAt(i)));
            secondHalfSum += Integer.parseInt(String.valueOf(strNumber.charAt(i + middleIndex)));

        }
        return firstHalfSum == secondHalfSum;
    }
}
