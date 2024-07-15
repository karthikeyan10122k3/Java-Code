package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

public class DiameterOfBinaryTree543 {
    static int maxDiameter = 0;

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,null,2};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        System.out.println(diameterOfBinaryTree(tree.root));

    }
    public static int diameterOfBinaryTree(BinaryTree.TreeNode<Integer> root) {

        if (root == null || (root.left == null && root.right == null)){
            return 0;
        }

        getHeight(root);
        return maxDiameter - 1 ;
    }

    public static int getHeight(BinaryTree.TreeNode<Integer> node ) {
        if (node == null) {
            return 0;
        }

        int leftHeight = getHeight(node.left);
        int rightHeight = getHeight(node.right);

        int diameter = leftHeight + rightHeight + 1;
        maxDiameter = Math.max(maxDiameter,diameter);

        return Math.max(leftHeight, rightHeight) + 1;
    }
}
