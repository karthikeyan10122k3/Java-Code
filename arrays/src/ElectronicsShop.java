package com.kar.practice.exercise.arrays.src;

public class ElectronicsShop {
    public static void main(String[] args) {
        int[] keyboards={3, 1};
        int[] drives={5, 2, 8};
        int totCost=10;
        System.out.println(getMoneySpent(keyboards,drives,totCost));
        }

    public static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        int max=-1;
        for (int keyboard : keyboards) {
            for (int drive : drives) {
                if (((keyboard + drive) <= b) && ((keyboard + drive) > max)) {
                    max = keyboard + drive;
                }
            }
        }

        return max;
    }
}
