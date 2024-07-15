package com.kar.practice.exercise.arrays.src;

import java.util.LinkedList;
import java.util.List;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        l1.add(1);
        l1.add(2);
        l1.add(4);

        List<Integer> l2 = new LinkedList<>();
        l2.add(1);
        l2.add(3);
        l2.add(4);

        System.out.println("List l1: " + l1);
        System.out.println("List l2: " + l2);

        System.out.println("Mergerd List: "+mergeSort(l1,l2));

    }

    private static List<Integer> mergeSort(List<Integer> l1, List<Integer> l2) {
        List<Integer> mergedList = new LinkedList<>();

       if (l1.isEmpty()) {
            return l2;
        } else if (l2.isEmpty()) {
            return l1;
        }

        int i=0,j=0;

        while(i < l1.size() && j < l2.size()){
            if (l1.get(i) <= l2.get(j)){
                mergedList.add(l1.get(i) );
                i++;
            }else {
                mergedList.add(l2.get(j) );
                j++;
            }
        }
        while (i< l1.size()){
            mergedList.add(l1.get(i));
            i++;
        }
        while (j< l2.size()){
            mergedList.add(l2.get(j));
            j++;
        }
        return mergedList;
    }


}
