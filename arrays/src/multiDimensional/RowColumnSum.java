package com.kar.practice.exercise.arrays.src.multiDimensional;

import java.util.ArrayList;

public class RowColumnSum {
    public static void main(String[] args) {
        int[][] matrix = {{20,40,0,10},
                          {30,40,10,60},
                          {20,100,0,10},
                          {70,40,0,50}};

        ArrayList<Integer> rowSum = new ArrayList<>();
        ArrayList<Integer> colSum = new ArrayList<>();

        for (int row = 0; row < matrix.length; row++) {
            int sum = 0;
            for (int column = 0; column < matrix.length; column++) {
                sum += matrix[row][column];
            }
            rowSum.add(sum);
        }
        System.out.println("Row Sum: "+rowSum);

        for (int row=0;row<matrix.length;row++) {
            int sum = 0;
            for (int column = 0; column < matrix.length; column++) {
                sum += matrix[column][row];
            }
            colSum.add(sum);
        }
        System.out.println("Column Sum: "+colSum);

    }
}
