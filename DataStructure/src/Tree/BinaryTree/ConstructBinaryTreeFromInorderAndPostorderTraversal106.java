package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.Arrays;

public class ConstructBinaryTreeFromInorderAndPostorderTraversal106 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        int[] inOrder = {9,3,15,20,7};
        int[] postOrder = {9,15,7,20,3};

        BinaryTree.TreeNode<Integer> root = buildTree(inOrder, postOrder);
        tree.displayTree(root);

    }
    public static BinaryTree.TreeNode<Integer> buildTree(int[] inorder, int[] postorder) {

        if (postorder.length == 0){
            return null;
        }

        int root = postorder[postorder.length - 1];
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root){
                index = i;
                break;
            }
        }

        BinaryTree.TreeNode<Integer> rootNode = new BinaryTree.TreeNode<>(root);
        rootNode.left = buildTree(Arrays.copyOfRange(inorder,0,index ),Arrays.copyOfRange(postorder,0,index ));
        rootNode.right = buildTree(Arrays.copyOfRange(inorder,index + 1,inorder.length),Arrays.copyOfRange(postorder,index ,postorder.length -1 ));

        return rootNode;
    }
}
