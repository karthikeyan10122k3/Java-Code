package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.*;

public class BinaryTreeLevelOrderTraversal2LC107 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {3,9,20,null,null,15,7};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(levelOrderBottom(tree.root));

    }
    public static List<List<Integer>> levelOrderBottom(BinaryTree.TreeNode<Integer> root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null){
            return result;
        }

        Queue<BinaryTree.TreeNode<Integer>> nodeOrderQueue = new LinkedList<>();
        nodeOrderQueue.offer(root);

        while (!nodeOrderQueue.isEmpty()){

            int levelSize = nodeOrderQueue.size();
            List<Integer> levelList = new ArrayList<>(levelSize);

            for (int i = 0; i < levelSize; i++) {
                BinaryTree.TreeNode<Integer> currNode = nodeOrderQueue.poll();
                levelList.add(currNode.val);
                if (currNode.left != null){
                    nodeOrderQueue.offer(currNode.left);
                }
                if (currNode.right != null){
                    nodeOrderQueue.offer(currNode.right);
                }
            }
            result.add(0,levelList);
        }
        return result;

    }
}
