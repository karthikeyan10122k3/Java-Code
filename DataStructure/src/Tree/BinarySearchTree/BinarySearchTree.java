package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class BinarySearchTree<T> {
    public static class Node<T>{
        T value;
        int height;
        Node<T> left;
        Node<T> right;

        public Node (T value){
            this.value = value;
        }
    }

    private Node<T> root;

    public BinarySearchTree(){

    }
    public int getHeight(Node<T> node){
        if (node == null){
            return  -1;
        }
        return node.height;
    }

    public boolean isEmpty(){
        return root == null;
    }

    public void createBinarySearchTree(){
        // To Do Tomorrow
    }


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
