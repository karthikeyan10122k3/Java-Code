package com.kar.practice.exercise.arrays.src;

public class Pattern {
    public static void main(String[] args) {
        patternPrinting8(5);
//        patternPrinting5(5);
//        patternPrinting4(5);

    }
    
    public static void patternPrinting8(int n ){
        int originalN=n;
         n=2 * n;
        for (int row = 0; row <= n ; row++) {
            for (int col = 0; col <= n; col++) {
                int atEveryIndex=originalN-Math.min(Math.min( row , col ) , Math.min( n-row , n-col ));
                System.out.print(atEveryIndex);


            }
            System.out.println();
            
        }
    }

    public static void patternPrinting7(int n){

        for (int row = 1; row <=2 * n; row++) {
            int c= row > n ? 2 * n - row : row;

            for (int space = 0; space <=n-c ; space++) {
                System.out.print("  ");

            }
            for (int col = c; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= c ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }
    public static void patternPrinting6(int n){

        for (int row = 1; row <= n; row++) {

            for (int space = 1; space <=n-row ; space++) {
                System.out.print("  ");

            }
            for (int col = row; col >=1 ; col--) {
                System.out.print(col+" ");
            }
            for (int col = 2; col <= row ; col++) {
                System.out.print(col+" ");

            }
            System.out.println();
            
        }
    }
    public static void patternPrinting5(int n){
        for (int row = 0; row < 2 * n; row++) {


            int totCol=row > n ? 2 * n - row : row;

            for (int space = 0; space <n-totCol ; space++) {
                    System.out.print(" ");
            }


            for (int col = 0; col < totCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void patternPrinting4(int n){



            for (int row = 1; row <= n; row++) {
                // Print spaces
                for (int space = 1; space <= n - row; space++) {

                    System.out.print(" ");
                }

                // Print stars
                for (int col = row; col >=1; col--) {
                    System.out.print("*");
                }
                for (int col = 2; col <= row; col++) {
                    System.out.print("*");
                }

                System.out.println(); // Move to the next line
            }
        }




    public static void patternPrinting3(int n){
//        for (int row = 1; row < 2*n ; row++) {
//            if (row > n) {
//                for (int col = row-n+1; col <= n; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//            }
//            else {
//                for (int col = 1; col <= row; col++) {
//                    System.out.print("* ");
//                }
//                System.out.println();
//
//                }
//            }
        for (int row = 0; row < 2 * n; row++) {

            int totCol=row > n ? 2 * n - row : row;

            for (int col = 0; col < totCol; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }


    public static void patternPrinting2(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 1; col <= row; col++) {
                System.out.print(col+" ");

            }
            System.out.println();

        }
    }
    public static void patternPrinting1(int n){
        for (int row = 1; row <=n; row++) {
            for (int col = 0; col < n-row+1; col++) {
                System.out.print("* ");
                
            }
            System.out.println();
            
        }
    }
}
