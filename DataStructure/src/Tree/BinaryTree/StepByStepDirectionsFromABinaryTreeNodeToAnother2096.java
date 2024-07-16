package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import static com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree.FindNodeInBinaryTree.findNodeUsingValue;

//https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/description/?envType=daily-question&envId=2024-07-16

public class StepByStepDirectionsFromABinaryTreeNodeToAnother2096 {
    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {5,1,2,3,null,6,4};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        BinaryTree.TreeNode<Integer> s = findNodeUsingValue(tree.root,3);
        BinaryTree.TreeNode<Integer> d = findNodeUsingValue(tree.root,6);

        BinaryTree.TreeNode<Integer> lowestCommonAncestor = lowestCommonAncestor(tree.root, s,d);

        String sPath = search(lowestCommonAncestor,s,"");
        String destinationPath = search(lowestCommonAncestor,d,"");

        StringBuilder sourcePath = new StringBuilder();
        if (sPath != null){
            sourcePath.append("U".repeat(sPath.length()));
            System.out.println(sourcePath + destinationPath);
        }else {
            System.out.println(destinationPath);
        }

    }

    private static String search(BinaryTree.TreeNode<Integer> root, BinaryTree.TreeNode<Integer> node, String path) {
        if (root == null){
            return null;
        }

        if (root == node){
            return path;
        }

        String leftPath = search(root.left, node, path + "L");
        if (leftPath != null) {
            return leftPath;
        }

        String rightPath = search(root.right, node, path + "R");
        if (rightPath != null) {
            return rightPath;
        }

        return null;

    }

//    private static String searchDestination(BinaryTree.TreeNode<Integer> lowestCommonAncestor, BinaryTree.TreeNode<Integer> d, String s) {
//    }

    public static BinaryTree.TreeNode<Integer> lowestCommonAncestor(BinaryTree.TreeNode<Integer> root, BinaryTree.TreeNode<Integer> p, BinaryTree.TreeNode<Integer> q) {

        if (root == null){
            return null;
        }
        if (root == p || root== q){
            return root;
        }

        BinaryTree.TreeNode<Integer> leftTree = lowestCommonAncestor(root.left, p, q);
        BinaryTree.TreeNode<Integer> rightTree = lowestCommonAncestor(root.right, p, q);

        if (leftTree!=null && rightTree != null){
            return root;
        }

        return leftTree == null ? rightTree : leftTree;

    }


}
