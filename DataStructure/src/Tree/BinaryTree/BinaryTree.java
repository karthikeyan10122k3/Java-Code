package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree<T> {
    Scanner sc = new Scanner(System.in);
    public static class BinaryTreeNode<T>{
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        public BinaryTreeNode(T data){
            this.data = data;
        }
    }

    public BinaryTreeNode<T> root;

    public void createBinaryTree() {
        System.out.println("Enter the Root BinaryTreeNode: ");
        T value = (T) sc.next();
        root = new BinaryTreeNode<>(value);
        createBinaryTree(root);
    }

    private void createBinaryTree(BinaryTreeNode<T> binaryTreeNode) {
        System.out.println("Enter left child of " + binaryTreeNode.data + " (or 'null' if no child): ");
        String leftData = sc.next();
        if (!leftData.equals("null")) {
            binaryTreeNode.left = new BinaryTreeNode<>((T) leftData);
            createBinaryTree(binaryTreeNode.left);
        }

        System.out.println("Enter right child of " + binaryTreeNode.data + " (or 'null' if no child): ");
        String rightData = sc.next();
        if (!rightData.equals("null")) {
            binaryTreeNode.right = new BinaryTreeNode<>((T) rightData);
            createBinaryTree(binaryTreeNode.right);
        }
    }

    public void displayTree() {
        displayTree(root, "", true);
    }

    private void displayTree(BinaryTreeNode<T> binaryTreeNode, String indent, boolean isRight) {
        if (binaryTreeNode == null) {
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

        System.out.println(binaryTreeNode.data);
        displayTree(binaryTreeNode.left, indent, false);
        displayTree(binaryTreeNode.right, indent, true);
    }

    public void createBinaryTreeFromArray(T[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        T value = (T) array[0];
        root = new BinaryTreeNode<>(value);
        Queue<BinaryTreeNode<T>> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < array.length) {
            BinaryTreeNode<T> currentNode = queue.poll();
            if (currentNode != null) {
                // Add left child
                if (i < array.length && array[i] != null) {
                    currentNode.left = (BinaryTreeNode<T>) new BinaryTreeNode<>(array[i]);
                    queue.add(currentNode.left);
                }
                i++;

                // Add right child
                if (i < array.length && array[i] != null) {
                    currentNode.right = (BinaryTreeNode<T>) new BinaryTreeNode<>(array[i]);
                    queue.add(currentNode.right);
                }
                i++;
            }
        }
    }


}
