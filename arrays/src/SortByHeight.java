package com.kar.practice.exercise.arrays.src;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
public class SortByHeight {
    public static void main(String[] args) {
        int[] a ={-1, 150, 190, 170, -1, -1, 160, 180};
        System.out.println(Arrays.toString(solution(a)));
    }
    private static int[] solution(int[] a) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i : a) {
            if (i != -1) {
                list.add(i);
            }
        }
        Collections.sort(list);
        int index = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] != -1) {
                a[i] = list.get(index++);
            }
        }
        return a;
    }
}