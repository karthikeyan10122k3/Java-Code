package com.kar.practice.exercise.arrays.src;

import java.util.ArrayList;

public class AreSimilar {
    public static void main(String[] args) {
        int[] a = {832, 998, 148, 570, 533, 561, 894, 147, 455, 279} , b = {832, 570, 148, 998, 533, 561, 455, 147, 894, 279};
        System.out.println(areSimilar(a,b));
    }

    private static boolean areSimilar(int[] a, int[] b) {

        if(a.length != b.length) return false;
        ArrayList<Integer> indexes = new ArrayList<>();
        int diff =0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]){
                if (indexes.isEmpty()){
                    indexes.add(i);
                    diff++;
                    if (diff >=2) return false;
                } else if ((a[i] == b[indexes.get(0)]) && (b[i] == a[indexes.get(0)])) {
                    indexes.remove(0);
                }
            }

        }

        return indexes.isEmpty();
    }
}
