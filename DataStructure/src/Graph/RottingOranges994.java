package com.kar.practice.exercise.DataStructure.src.Graph;

import java.util.LinkedList;
import java.util.Queue;

public class RottingOranges994 {

    static class Pair {
        int row;
        int col;

        public Pair(int row, int col) {
            this.row = row;
            this.col = col;
        }
    }

    public static int orangesRotting(int[][] grid) {

        int time = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<Pair> queue = new LinkedList<>();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (grid[i][j] == 2) {
                    queue.add(new Pair(i, j));
                }
            }
        }

        int[] rowOffsets = {-1, 1, 0, 0};
        int[] colOffsets = {0, 0, -1, 1};

        while (!queue.isEmpty()) {
            int size = queue.size();
            boolean rotted = false;
            for (int i = 0; i < size; i++) {
                int row = queue.peek().row;
                int col = queue.peek().col;
                queue.poll();
                for (int j = 0; j < 4; j++) {
                    int newRow = row + rowOffsets[j];
                    int newCol = col + colOffsets[j];

                    if (isValid(grid, newRow, newCol) && grid[newRow][newCol] == 1) {
                        grid[newRow][newCol] = 2;
                        queue.offer(new Pair(newRow, newCol));
                        rotted = true;
                    }
                }
            }
            if (rotted) {
                time++;
            }
        }

        for (int[] row : grid) {
            for (int j = 0; j < cols; j++) {
                if (row[j] == 1) {
                    return -1;
                }
            }
        }
        return time;
    }

    public static boolean isValid(int[][] matrix, int row, int col) {
        return row >= 0 && row < matrix.length && col >= 0 && col < matrix[0].length;
    }

    public static void main(String[] args) {
        int[][] edges = {{2,1,1},{0,1,1},{1,0,1}};
        System.out.println(orangesRotting(edges));
    }
}
