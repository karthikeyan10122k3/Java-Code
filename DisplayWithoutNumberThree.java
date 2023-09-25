package com.kar.practice.exercise;

public class DisplayWithoutNumberThree{
    public static void main(String[] args) {
    for(int i=1;i<=100;i++){
        if((i%10==3) || (i/10==3)){
            continue;
        }
        else {
            System.out.println(i);
        }
    }

    }
}
