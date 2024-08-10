package com.kar.practice.exercise.DataStructure.src.Graph;

public class SurroundedRegions130 {

    public static void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        boolean[][] visited = new boolean[m][n];

        // Mark boundary 'O' and connected 'O' using DFS
        for (int col = 0; col < n; col++) {
            if (board[0][col] == 'O') {
                dfs(0, col, visited, board);
            }
            if (board[m - 1][col] == 'O') {
                dfs(m - 1, col, visited, board);
            }
        }

        for (int row = 0; row < m; row++) {
            if (board[row][0] == 'O') {
                dfs(row, 0, visited, board);
            }
            if (board[row][n - 1] == 'O') {
                dfs(row, n - 1, visited, board);
            }
        }

        // Flip all unvisited 'O' to 'X'
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] == 'O' && !visited[i][j]) {
                    board[i][j] = 'X';
                }
            }
        }
    }

    private static void dfs(int row, int col, boolean[][] visited, char[][] board) {
        visited[row][col] = true;
        int[] rowOffsets = {-1, 1, 0, 0};
        int[] colOffsets = {0, 0, -1, 1};

        for (int j = 0; j < 4; j++) {
            int newRow = row + rowOffsets[j];
            int newCol = col + colOffsets[j];

            if (isValid(board, newRow, newCol) && board[newRow][newCol] == 'O' && !visited[newRow][newCol]) {
                dfs(newRow, newCol, visited, board);
            }
        }
    }

    public static boolean isValid(char[][] board, int row, int col) {
        return row >= 0 && row < board.length && col >= 0 && col < board[0].length;
    }

    public static void main(String[] args) {
        char[][] board = {
                {'O', 'X', 'X', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'X', 'O', 'X'},
                {'X', 'O', 'X', 'X'}
        };
        solve(board);

        for (char[] row : board) {
            for (char col : row) {
                System.out.print(col + " ");
            }
            System.out.println();
        }
    }
}
