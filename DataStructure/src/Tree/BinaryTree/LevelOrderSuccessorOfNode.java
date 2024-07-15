package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.*;

public class LevelOrderSuccessorOfNode {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,4,5,null,null,10,11};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(levelOrder(tree.root, 5));

    }

    public static int levelOrder(BinaryTree.TreeNode<Integer> root , int key) {

        if (root == null){
            return 0;
        }

        Queue<BinaryTree.TreeNode<Integer>> nodeOrderQueue = new LinkedList<>();
        nodeOrderQueue.offer(root);

        while (!nodeOrderQueue.isEmpty()){

                BinaryTree.TreeNode<Integer> currNode = nodeOrderQueue.poll();
                if (currNode.val == key && nodeOrderQueue.peek() != null){
                    return nodeOrderQueue.poll().val;
                }
                if (currNode.left != null ){
                    nodeOrderQueue.offer(currNode.left);
                }
                if (currNode.right != null){
                    nodeOrderQueue.offer(currNode.right);
                }

        }
        return -1;
    }
}
