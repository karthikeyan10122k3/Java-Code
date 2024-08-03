package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.List;

public class PathSumII113 {

    static List<List<Integer>> paths = new ArrayList<>();
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {5,4,8,11,null,13,4,7,2,null,null,5,1};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        hasPathSum(tree.root,22,new ArrayList<>());
        System.out.println(paths);

    }
    public static void hasPathSum(BinaryTree.TreeNode<Integer> root, int targetSum, List<Integer> currPath) {

        if (root == null){
            return ;
        }
        currPath.add(root.val);
        if (root.left == null && root.right == null && targetSum == root.val){
            paths.add(new ArrayList<>(currPath));
        }else {
            hasPathSum(root.left, targetSum - root.val,new ArrayList<>(currPath) );
            hasPathSum(root.right, targetSum - root.val, new ArrayList<>(currPath));
        }

    }
}

