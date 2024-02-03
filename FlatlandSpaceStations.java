package com.kar.practice.exercise;

import java.util.Scanner;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.print("Enter Number of Cities: ");
        int n = sc.nextInt();

        int[] c = new int[n];
        System.out.print("Enter No of Cities with Space Station: ");
        int m = sc.nextInt();
        System.out.print("Enter the City with Space Station: ");
        for (int i = 0; i < m; i++) {
            c[i] = sc.nextInt();
        }
        System.out.println(flatlandSpaceStations(n,c));

    }

    public static int flatlandSpaceStations(int n, int[] c) {
        int minDistance = Integer.MAX_VALUE, maxDistance=0;
        for(int i=0;i<n;i++){
            for (int k : c) {
                {
                    int distance = Math.abs(i - k);
                    if (distance < minDistance)
                        minDistance = distance;
                }
            }
            if(minDistance > maxDistance)
                maxDistance = minDistance;
            minDistance = Integer.MAX_VALUE;

        }
        return maxDistance;
    }
}
