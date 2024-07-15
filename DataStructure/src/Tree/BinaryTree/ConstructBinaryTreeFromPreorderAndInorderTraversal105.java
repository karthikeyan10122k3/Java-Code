package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;


import java.util.Arrays;

import static com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree.FindNodeInBinaryTree.findNodeUsingValue;

public class ConstructBinaryTreeFromPreorderAndInorderTraversal105 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();

        int[] preOrder = {3, 9, 20, 15, 7};
        int[] inOrder = {9, 3, 15, 20, 7};

        BinaryTree.TreeNode<Integer> root = buildTree(preOrder, inOrder);
        tree.displayTree(root);

    }

    public static BinaryTree.TreeNode<Integer> buildTree(int[] preorder, int[] inorder) {

        if (preorder.length == 0 ){
            return null;
        }

        int root = preorder[0];
        int index = 0;

        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == root){
                index = i;
            }
        }

        BinaryTree.TreeNode<Integer> rootNode = new BinaryTree.TreeNode<>(root);
        rootNode.left = buildTree(Arrays.copyOfRange(preorder,1,index + 1),Arrays.copyOfRange(inorder,0,index ));
        rootNode.right = buildTree(Arrays.copyOfRange(preorder,index + 1,preorder.length), Arrays.copyOfRange(inorder,index+ 1,inorder.length));

        return rootNode;
    }
}
