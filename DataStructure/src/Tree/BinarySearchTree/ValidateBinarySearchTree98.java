package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class ValidateBinarySearchTree98 {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinarySearchTree.TreeNode<Integer> root = bst.insert(new Integer[]{2,1,3});
        System.out.println(isValidBST(root));
    }
    public static boolean isValidBST(BinarySearchTree.TreeNode<Integer> root) {

    return helperFunction(root, null,null);
}

    private static boolean helperFunction(BinarySearchTree.TreeNode<Integer> node, Integer leftVal, Integer rightVal) {
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
