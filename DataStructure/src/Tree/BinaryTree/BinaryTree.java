package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.Scanner;

public class BinaryTree<T> {
    Scanner sc = new Scanner(System.in);
    private static class Node<T>{
        T data;
        Node<T> left;
        Node<T> right;
        public Node(T data){
            this.data = data;
        }
    }

    private Node<T> root;

    public void createBinaryTree() {
        System.out.println("Enter the Root Node: ");
        T value = (T) sc.next();
        root = new Node<>(value);
        createBinaryTree(root);
    }

    private void createBinaryTree(Node<T> node) {
        System.out.println("Enter left child of " + node.data + " (or 'null' if no child): ");
        String leftData = sc.next();
        if (!leftData.equals("null")) {
            node.left = new Node<>((T) leftData);
            createBinaryTree(node.left);
        }

        System.out.println("Enter right child of " + node.data + " (or 'null' if no child): ");
        String rightData = sc.next();
        if (!rightData.equals("null")) {
            node.right = new Node<>((T) rightData);
            createBinaryTree(node.right);
        }
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

        System.out.println(node.data);
        displayTree(node.left, indent, false);
        displayTree(node.right, indent, true);
    }

}
