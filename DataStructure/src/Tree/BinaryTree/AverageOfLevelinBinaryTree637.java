package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class AverageOfLevelinBinaryTree637 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {3,9,20,null,null,15,7};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(levelOrder(tree.root));

    }

    public static List<Double> levelOrder(BinaryTree.TreeNode<Integer> root) {
        List<Double> result = new ArrayList<>();

        if (root == null){
            return result;
        }


        Queue<BinaryTree.TreeNode<Integer>> nodeOrderQueue = new LinkedList<>();
        nodeOrderQueue.offer(root);

        while (!nodeOrderQueue.isEmpty()){
            double sum = 0.0;
            int levelSize = nodeOrderQueue.size();

            for (int i = 0; i < levelSize; i++) {
                BinaryTree.TreeNode<Integer> currNode = nodeOrderQueue.poll();
                sum += currNode.val;
                if (currNode.left != null){
                    nodeOrderQueue.offer(currNode.left);
                }
                if (currNode.right != null){
                    nodeOrderQueue.offer(currNode.right);
                }
            }

            result.add( sum / levelSize);
        }
        return result;
    }
}
