package com.kar.practice.exercise.arrays.src;

import java.util.Arrays;

public class RotateImage {
    public static void main(String[] args) {
        int[][] a = {{1, 2, 3},
                    {4, 5, 6},
                    {7, 8, 9}};

        System.out.println(Arrays.deepToString(solution(a)));
    }

    private static int[][] solution(int[][] a) {
        int n = a.length;

        // Transposing
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                int temp = a[i][j];
                a[i][j] = a[j][i];
                a[j][i] = temp;
            }
        }

        // Reversing
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n / 2; j++) {
                int temp = a[i][j];
                a[i][j] = a[i][n - 1 - j];
                a[i][n - 1 - j] = temp;
            }
        }
        return a;
    }
}
