package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class BinarySearchTree<T extends Comparable<T>> {

//  Node Class
    public static class Node<T>{
        final T value;
        private int height;
        Node<T> left;
        Node<T> right;

        public Node (T value){
            this.value = value;
        }
    }

    public BinarySearchTree(){

    }

//  Getting Height Of the Node
    public int getHeight(Node<T> node){
        if (node == null){
            return  -1;
        }
        return node.height;
    }
//  Checking if Tree is Empty
    public boolean isEmpty(){
        return root == null;
    }

    private Node<T> root;

//  Inserting Part

    // Inserting Individual Element
    public Node<T> insert(T value) {
        root = insert(root, value);
        return root;
    }

    // Inserting as Array
    public Node<T> insert(T[] inputArray){
        for (T value : inputArray) {
            root = insert(root, value);
        }
        return root;
    }

    // Inserting a Sorted Array
    public void insertSortedArray(T[] inpurArray){
        insertSortedArray(inpurArray,0,inpurArray.length - 1);
    }
    public void insertSortedArray(T[] inpurArray,int start,int end){
        if ( start > end){
            return;
        }
        int mid = ( start + end ) / 2;

        insert(inpurArray[mid]);
        insertSortedArray(inpurArray,start,mid - 1);
        insertSortedArray(inpurArray,mid + 1,end);

    }

    // Inserting element in a Tree Main Recursive Function
    private Node<T> insert(Node<T> node, T value) {
        if (node == null) {
            Node<T> newNode = new Node<>(value);
            return newNode;
        }

        int compare = value.compareTo(node.value);
        if (compare < 0) {
            node.left = insert(node.left, value);
        } else if (compare > 0) {
            node.right = insert(node.right, value);
        }

        node.height = Math.max(getHeight(node.left), getHeight(node.left)) + 1;

        return node;
    }

//  Checking if A Node is Balanced
    private boolean balanced(Node<T> node){
        if (node == null){
            return true;
        }

        return Math.max(getHeight(node.left), getHeight(node.right)) <=1 && balanced(node.left) && balanced(node.right) ;
    }

//  Displaying Tree Part
    public void displayTree() {
        displayTree(root, "", true);
    }

    private void displayTree(Node<T> node, String indent, boolean isRight) {
        if (node == null) {
            return;
        }

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
            indent += "     ";
        } else {
            System.out.print("L----");
            indent += "|    ";
        }

        System.out.println(node.value);
        displayTree(node.left, indent, false);
        displayTree(node.right, indent, true);
    }

}
