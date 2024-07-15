package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;


import java.util.LinkedList;
import java.util.Queue;

public class PopulatingNextRightPointersInEachNode116 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,4,5,6,7,8,9,10,11};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(connect(tree.root));

    }
    public static BinaryTree.TreeNode<Integer> connect(BinaryTree.TreeNode<Integer> root) {

        if (root == null){
            return null;
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
                if (nodeOrderQueue.peek() != null){
                    currNode.next = nodeOrderQueue.peek();
                }
            }
            currNode.next = null;
        }
        return root;
    }
}
