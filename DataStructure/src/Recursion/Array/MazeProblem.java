package com.kar.practice.exercise.DataStructure.src.Recursion.Array;

import java.util.Arrays;

public class MazeProblem {
    public static void main(String[] args) {

        int row = 0;
        int column = 0;
        String path = "";

        // For  mazeProblemAllSidesPath(maze,row,column,path);
        boolean[][] maze = {
                {true, true,true},
                {true, true,true},
                {true, true,true},
        };

        // For         mazeProblemAllSidesPathWithMaze(maze,row,column,path);
        int[][] PathWayMaze = {
                {0, 0, 0},
                {0, 0, 0},
                {0, 0, 0},
        };
      System.out.println(mazeProblemCount(3,3));
//      mazeProblemPath(row,column,path);
//      System.out.println(mazeProblemDiagonalIncludedCount(row,column));
//      mazeProblemDiagonalIncludedPath(row,column,path);
//      mazeProblemWithObstaclePath(maze,row,column,path);
//      mazeProblemAllSidesPath(maze,row,column,path);
//      mazeProblemAllSidesPathWithMaze(PathWayMaze,row,column,path, 0);
    }


    private static int mazeProblemCount(int row, int column ) {

        if (row == 1 || column == 1){
            return 1 ;
        }

        int moveRight = mazeProblemCount(row, column - 1);
        int moveDown = mazeProblemCount(row - 1, column );

        return moveRight + moveDown;
    }

    private static void mazeProblemPath(int row, int column, String path ) {

        if (row == 1 && column == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazeProblemPath(row - 1, column , path + "D");

        }
        if (column > 1) {
            mazeProblemPath(row, column - 1,path + "R");
        }

    }

    private static int mazeProblemDiagonalIncludedCount(int row, int column ) {

        if (row == 1 || column == 1){
            return 1 ;
        }

        int moveRight = mazeProblemDiagonalIncludedCount(row, column - 1);
        int moveDiagonal = mazeProblemDiagonalIncludedCount(row - 1, column - 1);
        int moveDown = mazeProblemDiagonalIncludedCount(row - 1, column );

        return moveRight + moveDiagonal + moveDown;
    }

    private static void mazeProblemDiagonalIncludedPath(int row, int column, String path ) {

        if (row == 1 && column == 1){
            System.out.println(path);
            return;
        }

        if (row > 1){
            mazeProblemDiagonalIncludedPath(row - 1, column , path + "Down, ");

        }
        if (column > 1) {
            mazeProblemDiagonalIncludedPath(row, column - 1,path + "Right, ");
        }

        if (row > 1 && column > 1){
            mazeProblemDiagonalIncludedPath(row - 1, column - 1,path + "Diagonal, ");
        }

    }

    private static void mazeProblemWithObstaclePath(boolean[][] maze, int row, int column, String path ) {

        if (row == maze.length - 1 && column == maze[column].length - 1){
            System.out.println("Valid Path: "+path);
            return;
        }

        if (!maze[row][column]){
            System.out.println("InValid Path: "+path);

            return;
        }

        if (row < maze.length - 1){
            mazeProblemWithObstaclePath(maze,row + 1, column , path + "D");

        }
        if (column < maze[column].length - 1) {
            mazeProblemWithObstaclePath(maze,row, column + 1,path + "R");
        }

    }

    private static void mazeProblemAllSidesPath(boolean[][] maze, int row, int column, String path ) {

        if (row == maze.length - 1 && column == maze[column].length - 1){
            System.out.println(path);
            return;
        }

        if (!maze[row][column]){
            return;
        }

        // Making the cell False, so that it won't be visited again
        maze[row][column] = false;

        if (row < maze.length - 1){
            mazeProblemAllSidesPath(maze,row + 1, column , path + "D");
        }
        if (row > 0) {
            mazeProblemAllSidesPath(maze,row - 1, column ,path + "U");
        }
        if (column < maze[column].length - 1) {
            mazeProblemAllSidesPath(maze,row, column + 1,path + "R");
        }
        if (column > 0){
            mazeProblemAllSidesPath(maze,row , column - 1 , path + "L");
        }
        // Making the Cell True cause Backtracking can occur
        maze[row][column] = true;
    }

    private static void mazeProblemAllSidesPathWithMaze(int[][] maze, int row, int column, String path, int step ) {

        if (row == maze.length - 1 && column == maze[column].length - 1){
            maze[row][column] = step + 1;
            for (int[] mazeRow : maze) {
                System.out.println(Arrays.toString(mazeRow));
            }
            System.out.println(path);
            return;
        }

        if (maze[row][column] != 0){
            return;
        }

        maze[row][column] = step + 1;
        step++;

        if (row < maze.length - 1){
            mazeProblemAllSidesPathWithMaze(maze,row + 1, column , path + "D",step);
        }
        if (row > 0) {
            mazeProblemAllSidesPathWithMaze(maze,row - 1, column ,path + "U",step);
        }
        if (column < maze[column].length - 1) {
            mazeProblemAllSidesPathWithMaze(maze,row, column + 1,path + "R",step);
        }
        if (column > 0){
            mazeProblemAllSidesPathWithMaze(maze,row , column - 1 , path + "L",step);
        }

        maze[row][column] = 0;
    }
}
