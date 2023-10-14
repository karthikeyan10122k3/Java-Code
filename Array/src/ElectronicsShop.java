package com.kar.practice.exercise.Array.src;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards={3, 1};
        int[] drives={5, 2, 8};
        int totCost=10;
        System.out.println(getMoneySpent(keyboards,drives,totCost));
        }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max=-1;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                if (((keyboards[i]+drives[j])<=b) && ((keyboards[i]+drives[j])>max)) {
                    max = keyboards[i] + drives[j];
                }
            }
        }

        return max;
    }
}
