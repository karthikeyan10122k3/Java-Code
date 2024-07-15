package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

public class FlattenBinaryTreeToLinkedList114 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,5,3,4,null,6};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        flatten(tree.root);
        tree.displayTree();

    }
    public static void flatten(BinaryTree.TreeNode<Integer> root) {

        if(root == null){
            return ;
        }
        BinaryTree.TreeNode<Integer> currNode = root;
        while(currNode != null){
            if(currNode.left != null){
                BinaryTree.TreeNode<Integer> leftNode = currNode.left;
                BinaryTree.TreeNode<Integer> rightNode = currNode.right;
                while (leftNode.right != null){
                    leftNode = leftNode.right;
                }
                leftNode.right = rightNode;
                currNode.right = currNode.left;
                currNode.left = null;

            }
            currNode = currNode.right;
        }

    }
}
