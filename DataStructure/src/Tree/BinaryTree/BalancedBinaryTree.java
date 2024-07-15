package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;


public class BalancedBinaryTree {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {3,9,20,null,null,15,7};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();
        System.out.println(isBalanced(tree.root));

    }

    private static boolean isBalanced(BinaryTree.TreeNode<Integer> treeNode){
        if (treeNode == null) {
            return true;
        }

        int leftHeight = getHeight(treeNode.left);
        int rightHeight = getHeight(treeNode.right);

//        System.out.println("CurrNode data: " + treeNode.data);
//        System.out.println("Left height: " + leftHeight);
//        System.out.println("Right height: " + rightHeight);

        return Math.abs(leftHeight - rightHeight) <= 1 && isBalanced(treeNode.left) && isBalanced(treeNode.right);
    }

    private static int getHeight(BinaryTree.TreeNode<Integer> treeNode) {
        if (treeNode == null) {
            return 0;
        }

        int leftHeight = getHeight(treeNode.left);
        int rightHeight = getHeight(treeNode.right);

        return Math.max(leftHeight, rightHeight) + 1;

    }
}
