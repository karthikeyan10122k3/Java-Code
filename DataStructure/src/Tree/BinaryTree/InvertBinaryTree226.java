package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

public class InvertBinaryTree226 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {4,2,7,1,3,6,9};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        tree.displayTree(invertTree(tree.root));
    }
    public static BinaryTree.TreeNode<Integer> invertTree(BinaryTree.TreeNode<Integer> root) {

        if (root == null){
            return null;
        }
        BinaryTree.TreeNode<Integer> temp = root.left;
        root.left = root.right;
        root.right = temp;

        invertTree(root.left);
        invertTree(root.right);

        return root;

    }
}
