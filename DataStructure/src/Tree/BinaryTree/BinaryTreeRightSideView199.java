package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BinaryTreeRightSideView199 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,null,5,null,4};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        System.out.println(rightSideView(tree.root));

    }
    public static List<Integer> rightSideView(BinaryTree.TreeNode<Integer> root) {
        List<Integer> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<BinaryTree.TreeNode<Integer>> nodeOrderQueue = new LinkedList<>();
        nodeOrderQueue.offer(root);
        BinaryTree.TreeNode<Integer> currNode = null;
        while (!nodeOrderQueue.isEmpty()){

            int levelSize = nodeOrderQueue.size();

            for (int i = 0; i < levelSize; i++) {
                currNode = nodeOrderQueue.poll();
                if (currNode.left != null){
                    nodeOrderQueue.offer(currNode.left);
                }
                if (currNode.right != null){
                    nodeOrderQueue.offer(currNode.right);
                }
            }
            result.add(currNode.val);
        }
        return result;
    }
}
