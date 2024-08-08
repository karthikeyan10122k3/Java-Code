package com.kar.practice.exercise.DataStructure.src.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class ZeroOneMatrix542 {
    static class Pair{
        int row;
        int col;
        int steps;
        Pair(int r,int c, int s){
            this.row = r;
            this.col = c;
            this.steps = s;
        }
    }

    public static int[][] updateMatrix(int[][] mat) {
        int m = mat.length;
        int n = mat[0].length;
        int[][] stepMatrix = new int[m][n];
        boolean[][] visited = new boolean[m][n];

        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (mat[i][j] == 0){
                    queue.offer(new Pair(i,j,0));
                }
            }
        }

        int[] rowOffsets = {-1, 1, 0, 0};
        int[] colOffsets = {0, 0, -1, 1};


        while(!queue.isEmpty()){
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                Pair p = queue.poll();
                int row = p.row;
                int col = p.col;
                int steps = p.steps;
                stepMatrix[row][col] = steps;
                for (int j = 0; j < 4; j++) {
                    int newRow = row + rowOffsets[j];
                    int newCol = col + colOffsets[j];

                    if (isValid(mat, newRow, newCol) && mat[newRow][newCol] != 0 && !visited[newRow][newCol] ) {
                        visited[newRow][newCol] = true;
                        queue.offer(new Pair(newRow,newCol,steps + 1));
                    }
                }
            }
        }
        return stepMatrix;

    }

    public static boolean isValid(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }

    public static void main(String[] args) {
        int[][] matrix = {
                {1,1,1},
                {0,1,0},
                {1,1,1}
        };
        System.out.println(Arrays.deepToString(updateMatrix(matrix)));
    }
}
