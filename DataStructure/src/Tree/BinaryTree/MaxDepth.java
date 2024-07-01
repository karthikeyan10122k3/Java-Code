package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.Collections;

public class MaxDepth {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {3,9,20,null,null,15,7};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();
        System.out.println(maxDepth(tree.root));

    }

    private static int maxDepth(BinaryTree.BinaryTreeNode<Integer> treeNode) {
        return Collections.max(maxDepthHelper(treeNode,0,new ArrayList<>()));
    }

    private static ArrayList<Integer> maxDepthHelper(BinaryTree.BinaryTreeNode<Integer> treeNode, int noOfNodes, ArrayList<Integer> maxDepthArray) {
        if (treeNode == null){
            maxDepthArray.add(noOfNodes);
            return maxDepthArray;
        }
        System.out.println(treeNode.data);
        maxDepthHelper(treeNode.left, noOfNodes + 1 , maxDepthArray);
        maxDepthHelper(treeNode.right,  noOfNodes + 1 , maxDepthArray);

        return maxDepthArray;
    }
}
