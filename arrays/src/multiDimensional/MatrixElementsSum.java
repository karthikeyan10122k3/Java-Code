package com.kar.practice.exercise.arrays.src.multiDimensional;

import java.util.ArrayList;

public class MatrixElementsSum {
    public static void main(String[] args) {
        int[][] matrix = {{1, 1, 1, 0},
                          {0, 5, 0, 1},
                          {2, 1, 3, 10}};

        System.out.println(solution(matrix));
    }

    public static int solution(int[][] matrix) {
        ArrayList<Integer> zeroColumn = new ArrayList<>();

        int cost=0;

        for (int row = 0; row < matrix.length; row++) {
            for (int column = 0; column < matrix[0].length; column++) {
                if(matrix[row][column] == 0){
                    zeroColumn.add(column);
                }
                if (!zeroColumn.contains(column)){
                    cost += matrix[row][column];
                }
            }
        }
        return cost;
    }
}
