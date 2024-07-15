package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;


import java.util.Objects;

public class SameTree {
    public static void main(String[] args) {
        BinaryTree<Integer> tree1 = new BinaryTree<>();
        tree1.createBinaryTree();
        tree1.displayTree();

        BinaryTree<Integer> tree2 = new BinaryTree<>();
        tree2.createBinaryTree();
        tree2.displayTree();

        System.out.println(isSameTree(tree1.root,tree2.root));

    }
    public static boolean isSameTree(BinaryTree.TreeNode<Integer> p, BinaryTree.TreeNode<Integer> q) {
        if (p == null && q == null) {
            return true;
        }
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }

        return Objects.equals(p.val, q.val) && isSameTree(p.left,q.left) && isSameTree(p.right,q.right);



    }

}
