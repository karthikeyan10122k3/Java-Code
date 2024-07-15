package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

public class PathSum112 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {5,4,8,11,null,13,4,7,2,null,null,null,1};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(hasPathSum(tree.root,22));

    }
    public static boolean hasPathSum(BinaryTree.TreeNode<Integer> root, int targetSum) {

        if (root == null){
            return false;
        }

        if (root.left == null && root.right == null && targetSum == root.val){
            return true;
        }

        return hasPathSum(root.left, targetSum - root.val) ||
               hasPathSum(root.right, targetSum - root.val);
    }
}
