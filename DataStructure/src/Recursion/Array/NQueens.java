package com.kar.practice.exercise.DataStructure.src.Recursion.Array;

public class NQueens {
    public static void main(String[] args) {
        int noOfQueens = 8;
        boolean[][] board = new boolean[noOfQueens][noOfQueens];

        System.out.println("Total No of Solutions: "+ NQueensSolutions(board, 0));

    }


    private static int NQueensSolutions(boolean[][] board, int row) {

        if (row == board.length) {
//            System.out.println("SOLUTION!!");
//            for (boolean[] rows : board) {
//                for (int i = 0; i < board[0].length; i++) {
//                    if (rows[i]) {
//                        System.out.print("Q ");
//                    } else {
//                        System.out.print("X ");
//                    }
//                }
//                System.out.println();
//            }
            return 1;
        }
        int count = 0;


        for (int column = 0; column < board[0].length; column++) {

            if (canPlaceQueen(board,row,column)) {
                board[row][column] = true;
                count += NQueensSolutions(board, row + 1);
                board[row][column] = false;
            }

        }

        return count;
    }
    private static boolean canPlaceQueen(boolean[][] board, int row, int column) {

//      Checking for queens in Up Direction
        for (int row1 = row - 1; row1 >= 0; row1--) {
            if (board[row1][column]) {
                return false;
            }
        }

//      Checking For Queen in Diagonal Right
        for (int i = row - 1, j = column + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j]) {
                return false;
            }
        }

//    Checking For Queen in Diagonal Left
      for (int i = row - 1, j = column - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j]) {
                return false;
            }
        }

        return true;
    }

}
