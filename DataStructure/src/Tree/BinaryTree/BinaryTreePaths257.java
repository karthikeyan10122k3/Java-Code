package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class BinaryTreePaths257 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,null,5};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        System.out.println(binaryTreePaths(tree.root));
    }

    public static List<String> binaryTreePaths(BinaryTree.TreeNode<Integer> root) {
        List<String> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        binaryTreePathsHelper(root, "", res);
        return res;
    }

    public static void binaryTreePathsHelper(BinaryTree.TreeNode<Integer> root, String str, List<String> res) {
        if (root == null) {
            return;
        }

        if (root.left == null && root.right == null) {
            res.add(str + root.val);
            return;
        }

        binaryTreePathsHelper(root.left, str + root.val + "->", res);
        binaryTreePathsHelper(root.right, str + root.val + "->", res);
    }
}
