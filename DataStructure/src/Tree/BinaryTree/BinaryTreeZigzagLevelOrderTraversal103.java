package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;


import java.util.*;

public class BinaryTreeZigzagLevelOrderTraversal103 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,4,5};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        System.out.println(zigzagLevelOrder(tree.root));


    }
    public static List<List<Integer>> zigzagLevelOrder(BinaryTree.TreeNode<Integer> root) {

        List<List<Integer>> result = new ArrayList<>();
        if (root == null){
            return result;
        }

        Deque<BinaryTree.TreeNode<Integer>> levelQueue = new LinkedList<>();
        levelQueue.offer(root);

        boolean doZigZag = false;
        while (!levelQueue.isEmpty()){
            int levelQueueSize = levelQueue.size();
            List<Integer> levelNode = new ArrayList<>(levelQueueSize);

            System.out.println(doZigZag);
            for (int i = 0; i < levelQueueSize; i++) {
                BinaryTree.TreeNode<Integer> currNode = doZigZag ? levelQueue.removeLast() : levelQueue.poll();
                levelNode.add(currNode.val);

                if (!doZigZag){
                    if (currNode.left != null) {
                        levelQueue.offer(currNode.left);
                    }
                    if (currNode.right != null) {
                        levelQueue.offer(currNode.right);
                    }
                }else {
                    if (currNode.right != null) {
                        levelQueue.addFirst(currNode.right);
                    }
                    if (currNode.left != null) {
                        levelQueue.addFirst(currNode.left);
                    }
                }
            }
            result.add(levelNode);
            doZigZag = !doZigZag;
        }

        return result;
    }
}
