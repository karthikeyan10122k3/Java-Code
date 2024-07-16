package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

//https://leetcode.com/problems/minimum-depth-of-binary-tree/description/


import java.util.ArrayList;
import java.util.Collections;

public class MinimumDepthOfBinaryTree111 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,4,5,6,7,8,9,10,11};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(minDepth(tree.root));

    }

    public static int minDepth(BinaryTree.TreeNode<Integer> root) {

        if (root == null){
            return 0;
        }
        ArrayList<Integer> minDepthNum = minDepthHelper(root,0,new ArrayList<>());
        return Collections.min(minDepthNum);

    }

    private static ArrayList<Integer> minDepthHelper(BinaryTree.TreeNode<Integer> root, int depth , ArrayList<Integer> minDepthList) {
        if (root == null){
            return minDepthList;
        }

        depth += 1;
        if (root.left == null && root.right == null){
            minDepthList.add(depth);
        }
        minDepthHelper(root.left, depth, minDepthList);
        minDepthHelper(root.right, depth, minDepthList);

        return minDepthList;
    }
}
