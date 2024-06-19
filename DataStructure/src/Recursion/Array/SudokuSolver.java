package com.kar.practice.exercise.DataStructure.src.Recursion.Array;


public class SudokuSolver {
    public static void main(String[] args) {
        char[][] board = {
                {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
                {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
                {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
                {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
                {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
                {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
                {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
                {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
                {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        if (solve(board)){
            for (char[] rows: board){
                for (char col: rows){
                    System.out.print(col+" ");
                }
                System.out.println();
            }
        }else {
            System.out.println("NO SOLUTION!!");
        }

    }

    private static boolean solve(char[][] board) {
        int n = board.length;

        for (int row = 0; row < n; row++) {
            for (int column = 0; column < n; column++) {
                if (board[row][column] == '.') {
                    for (char numberToPlace = '1'; numberToPlace <= '9'; numberToPlace++) {
                        if (checkCellNumber(board, row, column, numberToPlace)) {
                            board[row][column] = numberToPlace;
                            if (solve(board)) {
                                return true;
                            }
                            board[row][column] = '.';
                        }
                    }
                    return false;
                }
            }
        }

        return true;
    }

    private static boolean checkCellNumber(char[][] board, int rowOfValue, int columnOfValue, char numberToPlace) {

//        checking Rows
        for (int row = 0; row < board.length; row++) {
            if ( board[row][columnOfValue] == numberToPlace){
                return false;
            }
        }

//        checking Columns
        for (int column = 0; column < board.length; column++) {
            if (board[rowOfValue][column] == numberToPlace){
                return false;
            }
        }
//        Checking 3x3 Box
        int boxRowStart = rowOfValue - rowOfValue % 3;
        int boxColStart = columnOfValue - columnOfValue % 3;

        for (int row = boxRowStart; row < boxRowStart + 3; row++) {
            for (int column = boxColStart; column < boxColStart + 3; column++) {
                if (board[row][column] == numberToPlace) {
                    return false;
                }
            }
        }


        return true;
    }
}
