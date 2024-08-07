package com.kar.practice.exercise.DataStructure.src.Graph;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class FloodFill733 {
    static class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }


    public static int[][] floodFill(int[][] image, int sr, int sc, int color) {

        if (image[sr][sc] == color){
            return image;
        }

        int[] rowOffsets = {-1, 1, 0, 0};
        int[] colOffsets = {0, 0, -1, 1};

        Queue<Pair> queue = new LinkedList<>();
        queue.add(new Pair(sr,sc));

        while (!queue.isEmpty()){

            int size = queue.size();
            for (int i = 0; i < size; i++) {
                int row = queue.peek().row;
                int col = queue.peek().col;
                queue.poll();
                for (int j = 0; j < 4; j++) {
                    int newRow = row + rowOffsets[j];
                    int newCol = col + colOffsets[j];

                    if (isValid(image, newRow, newCol) && image[newRow][newCol] != 0 && image[newRow][newCol] != color) {
                        image[newRow][newCol] = color;
                        queue.offer(new Pair(newRow, newCol));
                    }
                }
            }
        }
        return image;

    }

    public static boolean isValid(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }

    public static void main(String[] args) {
        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
        System.out.println(Arrays.deepToString(floodFill(image, 1, 1, 2)));;

    }
}
