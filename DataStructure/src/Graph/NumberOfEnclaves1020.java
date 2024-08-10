package com.kar.practice.exercise.DataStructure.src.Graph;

public class NumberOfEnclaves1020 {
    public static int numEnclaves(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        boolean[][] visited = new boolean[m][n];

        for (int col = 0; col < n; col++) {
            if (grid[0][col] == 1) {
                dfs(0, col, visited, grid);
            }
            if (grid[m - 1][col] == 1) {
                dfs(m - 1, col, visited, grid);
            }
        }

        for (int row = 0; row < m; row++) {
            if (grid[row][0] == 1) {
                dfs(row, 0, visited, grid);
            }
            if (grid[row][n - 1] == 1) {
                dfs(row, n - 1, visited, grid);
            }
        }

        int moves = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    moves++;
                }
            }
        }
        return moves;
    }

    private static void dfs(int row, int col, boolean[][] visited, int[][] grid) {
        visited[row][col] = true;
        int[] rowOffsets = {-1, 1, 0, 0};
        int[] colOffsets = {0, 0, -1, 1};

        for (int j = 0; j < 4; j++) {
            int newRow = row + rowOffsets[j];
            int newCol = col + colOffsets[j];

            if (isValid(grid, newRow, newCol) && grid[newRow][newCol] == 1 && !visited[newRow][newCol]) {
                dfs(newRow, newCol, visited, grid);
            }
        }
    }

    public static boolean isValid(int[][] grid, int row, int col) {
        return row >= 0 && row < grid.length && col >= 0 && col < grid[0].length;
    }

    public static void main(String[] args) {
        int[][] grid = {
                {0,1,1,0},
                {0,0,1,0},
                {0,0,1,0},
                {0,0,0,0}
        };

        System.out.print(numEnclaves(grid));

    }
}
