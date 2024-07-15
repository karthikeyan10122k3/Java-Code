package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class ValidateBinarySearchTree98 {
    public static void main(String[] args) {
        BinaryTree<Integer> bst = new BinaryTree<>();

        BinaryTree.TreeNode<Integer> root = bst.insert(new Integer[]{2,1,3});
        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(BinaryTree.TreeNode<Integer> root) {

    return helperFunction(root, null,null);
}

    private static boolean helperFunction(BinaryTree.TreeNode<Integer> node, Integer leftVal, Integer rightVal) {
        if (node == null) {
            return true;
        }

        if (leftVal != null && node.val <= leftVal) {
            return false;
        }
        if (rightVal != null && node.val >= rightVal) {
            return false;
        }

        return helperFunction(node.left, leftVal, node.val) && helperFunction(node.right, node.val, rightVal);
    }
}
