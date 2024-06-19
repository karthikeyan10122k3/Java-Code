package com.kar.practice.exercise.DataStructure.src.Recursion.Array;

public class NKnights {
    public static void main(String[] args) {
        int noOfKnights = 4;
        boolean[][] board = new boolean[noOfKnights][noOfKnights];

        System.out.println("Total No of Solutions: "+ NKnightsSolutions(board,0,0, noOfKnights));

    }

    private static int NKnightsSolutions(boolean[][] board,int row, int column, int noOfKnights) {

        if(noOfKnights == 0){
            System.out.println("SOLUTION!!");
            for (boolean[] rows : board) {
                for (boolean cols : rows) {
                    if (cols) {
                        System.out.print("K ");
                    } else {
                        System.out.print("O ");
                    }
                }
                System.out.println();
            }
            return 1;
        }

        if (row == board.length){
            return 0;
        }

        int count = 0;

        if (canPlaceKnight(board,row,column)){
            board[row][column] = true;
            if (column == board[0].length - 1){
                count += NKnightsSolutions(board, row + 1 ,0 , noOfKnights - 1);

            }else {
                count += NKnightsSolutions(board, row ,column + 1, noOfKnights - 1);

            }
            board[row][column] = false;
        }
        // If not safe move to next possible cell without decrementing Knight.
        if (column == board[0].length - 1){
            count += NKnightsSolutions(board, row + 1 ,0 , noOfKnights );
        }else {
            count += NKnightsSolutions(board, row ,column + 1, noOfKnights );
        }

        return count;
    }

    private static boolean canPlaceKnight(boolean[][] board, int row, int column) {
        if (row >= 2){
            if (column >= 1){
                if (board[row - 2][column - 1]){
                    return false;
                }
            }

            if (column <= board[0].length - 2){
                if (board[row - 2][column + 1]){
                    return false;
                }
            }
        }

        if (row >= 1){
            if (column >= 2){
                if (board[row - 1][column - 2]){
                    return false;
                }
            }
            if (column <= board[0].length - 3){
                if (board[row - 1][column + 2]){
                    return false;
                }
            }
        }

        return true;
    }
}
