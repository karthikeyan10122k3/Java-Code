package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;


import java.util.ArrayList;

import static com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree.FindNodeInBinaryTree.findNodeUsingValue;

public class LowestCommonAncestorOfABinaryTree236 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {3,5,1,6,2,0,8,null,null,7,4};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        BinaryTree.TreeNode<Integer> p = findNodeUsingValue(tree.root,5);
        BinaryTree.TreeNode<Integer> q = findNodeUsingValue(tree.root,4);

        System.out.println(lowestCommonAncestor(tree.root,p,q).val);

    }
    public static BinaryTree.TreeNode<Integer> lowestCommonAncestor(BinaryTree.TreeNode<Integer> root, BinaryTree.TreeNode<Integer> p, BinaryTree.TreeNode<Integer> q) {

        if (root == null){
            return null;
        }
        if (root == p || root== q){
            return root;
        }

        BinaryTree.TreeNode<Integer> leftTree = lowestCommonAncestor(root.left, p, q);
        BinaryTree.TreeNode<Integer> rightTree = lowestCommonAncestor(root.right, p, q);

        if (leftTree!=null && rightTree != null){
            return root;
        }

        return leftTree == null ? rightTree : leftTree;

    }

}
