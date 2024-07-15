package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;


import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TraversalDisplayBFS {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,4,5,6,7,8,9,10,11};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(levelOrder(tree.root));

    }

    public static List<List<Integer>> levelOrder(BinaryTree.TreeNode<Integer> root) {
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
            result.add(levelList);
        }
        return result;
    }
}
