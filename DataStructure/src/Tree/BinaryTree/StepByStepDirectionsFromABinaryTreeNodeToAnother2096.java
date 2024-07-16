package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import static com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree.FindNodeInBinaryTree.findNodeUsingValue;

//https://leetcode.com/problems/step-by-step-directions-from-a-binary-tree-node-to-another/description/?envType=daily-question&envId=2024-07-16

public class StepByStepDirectionsFromABinaryTreeNodeToAnother2096 {
    public static void main(String[] args) {

        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {5,1,2,3,null,6,4};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        System.out.println(getDirections(tree.root,3,6));

    }

    public static String getDirections(BinaryTree.TreeNode<Integer> root, int startValue, int destValue) {

        BinaryTree.TreeNode<Integer> lowestCommonAncestor = lowestCommonAncestor(root, startValue, destValue);

        String sPath = search(lowestCommonAncestor,startValue,new StringBuilder());
        String destinationPath = search(lowestCommonAncestor, destValue, new StringBuilder());

        if (sPath != null){
            return "U".repeat(sPath.length()) + destinationPath;
        }

        return destinationPath;

    }
    private static String search(BinaryTree.TreeNode<Integer> root, int val, StringBuilder path) {
        if (root == null){
            return null;
        }

        if (root.val == val){
            return path.toString();
        }

        path.append("L");
        String leftPath = search(root.left, val, path);
        if (leftPath != null) {
            return leftPath;
        }
        path.deleteCharAt(path.length() - 1);

        path.append("R");
        String rightPath = search(root.right, val, path);
        if (rightPath != null) {
            return rightPath;
        }
        path.deleteCharAt(path.length() - 1);
        return null;
    }
    public static BinaryTree.TreeNode<Integer> lowestCommonAncestor(BinaryTree.TreeNode<Integer> root, int p, int q) {

        if (root == null){
            return null;
        }
        if (root.val == p || root.val == q){
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
