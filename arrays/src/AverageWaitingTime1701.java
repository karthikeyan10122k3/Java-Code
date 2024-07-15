package com.kar.practice.exercise.arrays.src;

public class AverageWaitingTime1701 {
    public static void main(String[] args) {
        int[][] customers = {{5, 2},
                             {5, 4},
                             {10, 3},
                             {20,1}};

        System.out.println(averageWaitingTime(customers));
    }
    public static double averageWaitingTime(int[][] customers) {

        double ct = 0.0;
        double wt = 0.0;
        double totCustomer = customers.length;

        for (int[] customer: customers){

            if (wt < customer[0]){
                wt += (customer[0] - wt) + customer[1];

            }else {
                wt += customer[1];
            }
            ct += wt - customer[0];
        }

        return  ct / totCustomer;
    }
}
