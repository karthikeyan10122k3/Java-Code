package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.Objects;

public class SymmetricTree {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,2,3,4,4,3};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();
        System.out.println(isSymmetric(tree.root));

    }

    private static boolean isSymmetric(BinaryTree.TreeNode<Integer> treeNode) {
        return isSymmetricHelper(treeNode.left,treeNode.right) ;
    }

    private static boolean isSymmetricHelper(BinaryTree.TreeNode<Integer> leftSubTree, BinaryTree.TreeNode<Integer> rightSubTree) {
        if (leftSubTree == null && rightSubTree == null) {
            return true;
        }

        if (leftSubTree == null && rightSubTree != null) {
            return false;
        }
        if (leftSubTree != null && rightSubTree == null) {
            return false;
        }

        return Objects.equals(leftSubTree.val, rightSubTree.val) && isSymmetricHelper(leftSubTree.left, rightSubTree.right) && isSymmetricHelper(leftSubTree.right, rightSubTree.left);
    }
}
