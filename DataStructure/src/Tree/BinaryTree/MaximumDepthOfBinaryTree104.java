package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class MaximumDepthOfBinaryTree104 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {3,9,20,null,null,15,7};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();
        System.out.println(maxDepth(tree.root));

    }

    private static int maxDepth(BinaryTree.TreeNode<Integer> treeNode) {
        return Collections.max(maxDepthHelper(treeNode,0,new ArrayList<>()));
    }

    private static ArrayList<Integer> maxDepthHelper(BinaryTree.TreeNode<Integer> treeNode, int noOfNodes, ArrayList<Integer> maxDepthArray) {
        if (treeNode == null){
            maxDepthArray.add(noOfNodes);
            return maxDepthArray;
        }
        maxDepthHelper(treeNode.left, noOfNodes + 1 , maxDepthArray);
        maxDepthHelper(treeNode.right,  noOfNodes + 1 , maxDepthArray);

        return maxDepthArray;
    }
}
