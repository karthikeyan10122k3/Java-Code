package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

public class FindNodeInBinaryTree {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,4};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(findNodeUsingValue(tree.root,4));

    }

    public static BinaryTree.TreeNode<Integer> findNodeUsingValue(BinaryTree.TreeNode<Integer> root, int value){
    if (root == null){
        return null;
    }

    if (root.val == value){
        return root;
    }
    BinaryTree.TreeNode<Integer> nodeFromLeft = findNodeUsingValue(root.left, value);
    if (nodeFromLeft != null){
        return nodeFromLeft;
    }
    BinaryTree.TreeNode<Integer> nodeFromRight = findNodeUsingValue(root.right, value);
    return nodeFromRight;
}
}
