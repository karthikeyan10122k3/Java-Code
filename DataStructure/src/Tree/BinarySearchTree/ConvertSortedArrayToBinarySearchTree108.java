package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class ConvertSortedArrayToBinarySearchTree108 {

    public static void main(String[] args) {
        int[] arr = {-10, -3, 0, 5, 9};
        BinaryTree.TreeNode<Integer> root = insertSortedArray(arr);
        displayTree(root, "", true);
    }

    public static BinaryTree.TreeNode<Integer> insertSortedArray(int[] inputArray) {
        return insertSortedArray(inputArray, 0, inputArray.length - 1);
    }

    public static BinaryTree.TreeNode<Integer> insertSortedArray(int[] inputArray, int start, int end) {
        if (start > end) {
            return null;
        }

        int mid = start + (end - start + 1) / 2;

        BinaryTree.TreeNode<Integer> node = new BinaryTree.TreeNode<>(inputArray[mid]);

        node.left = insertSortedArray(inputArray, start, mid - 1);
        node.right = insertSortedArray(inputArray, mid + 1, end);

        return node;
    }
    private static void displayTree(BinaryTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
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
}

