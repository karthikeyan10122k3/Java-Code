package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

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

}
