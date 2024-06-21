package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class SampleTest {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();
//        bst.insert(50);
//        bst.insert(70);
//        bst.insert(100);
//        bst.insert(10);
//        bst.insert(30);
//        bst.insert(40);

        Integer[] arr = {1,2,3,4,5,6,7,8};

        bst.insertSortedArray(arr);
        bst.displayTree();

    }
}
