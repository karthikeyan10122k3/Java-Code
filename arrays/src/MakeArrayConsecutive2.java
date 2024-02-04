package com.kar.practice.exercise.arrays.src;

import java.util.Arrays;

public class MakeArrayConsecutive2 {
    public static void main(String[] args) {
        int[] statues = {6,2,3,8};
        System.out.println("Number os Statues Required: " + solutions(statues));
    }

    public static int solutions(int[] statues) {

        Arrays.sort(statues);
        int statuesRequired = 0;

        for (int i = 0; i < statues.length-1; i++) {
            if((statues[i+1] - statues[i]) != 1){
                statuesRequired += statues[i+1] - statues[i]-1;
            }
        }
        return statuesRequired;
    }

}
