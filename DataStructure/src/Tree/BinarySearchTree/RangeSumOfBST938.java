package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

public class RangeSumOfBST938 {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinarySearchTree.TreeNode<Integer> root = bst.insert(new Integer[]{10,5,15,3,7,null,18});
        System.out.println(rangeSumBST(root,7,15));
    }

    public static int rangeSumBST(BinarySearchTree.TreeNode<Integer> root, int low, int high) {
        int count=0;
        if (root == null){
            return count;
        }

        if (root.val >= low && root.val <= high){
            count += root.val;
        }
        count += rangeSumBST(root.left, low, high);
        count += rangeSumBST(root.right, low, high);

        return count;
    }
}
