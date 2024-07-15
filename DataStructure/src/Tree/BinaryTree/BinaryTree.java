package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BinaryTree<T> {
    Scanner sc = new Scanner(System.in);
    public static class TreeNode<T>{
        T val;
        TreeNode<T> left;
        TreeNode<T> right;
        TreeNode<T> next;
        public TreeNode(T val){
            this.val = val;
        }
    }

    public TreeNode<T> root;

    public void createBinaryTree() {
        System.out.println("Enter the Root BinaryTreeNode: ");
        T value = (T) sc.next();
        root = new TreeNode<>(value);
        createBinaryTree(root);
    }

    private void createBinaryTree(TreeNode<T> treeNode) {
        System.out.println("Enter left child of " + treeNode.val + " (or 'null' if no child): ");
        String leftData = sc.next();
        if (!leftData.equals("null")) {
            treeNode.left = new TreeNode<>((T) leftData);
            createBinaryTree(treeNode.left);
        }

        System.out.println("Enter right child of " + treeNode.val + " (or 'null' if no child): ");
        String rightData = sc.next();
        if (!rightData.equals("null")) {
            treeNode.right = new TreeNode<>((T) rightData);
            createBinaryTree(treeNode.right);
        }
    }

    public void displayTree() {
        displayTree(root, "", true);
    }
    public  void displayTree(TreeNode<T> treeNode){
        displayTree(treeNode, "", true);
    }

    private void displayTree(TreeNode<T> treeNode, String indent, boolean isRight) {
        if (treeNode == null) {
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

        System.out.println(treeNode.val);
        displayTree(treeNode.left, indent, false);
        displayTree(treeNode.right, indent, true);
    }

    public void createBinaryTreeFromArray(T[] array) {
        if (array == null || array.length == 0) {
            return;
        }

        T value = (T) array[0];
        root = new TreeNode<>(value);
        Queue<TreeNode<T>> queue = new LinkedList<>();
        queue.add(root);

        int i = 1;
        while (i < array.length) {
            TreeNode<T> currentNode = queue.poll();
            if (currentNode != null) {
                // Add left child
                if (i < array.length && array[i] != null) {
                    currentNode.left = (TreeNode<T>) new TreeNode<>(array[i]);
                    queue.add(currentNode.left);
                }
                i++;

                // Add right child
                if (i < array.length && array[i] != null) {
                    currentNode.right = (TreeNode<T>) new TreeNode<>(array[i]);
                    queue.add(currentNode.right);
                }
                i++;
            }
        }
    }


}
