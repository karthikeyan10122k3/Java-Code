package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;

import static com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree.FindNodeInBinaryTree.findNodeUsingValue;

public class CousinsInBinaryTree993 {
    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {1,2,3,4};

        tree.createBinaryTreeFromArray(array);
        tree.displayTree();


        System.out.println(isCousins(tree.root,5,4));

    }
    public static boolean isCousins(BinaryTree.TreeNode<Integer> root, int x, int y) {

        BinaryTree.TreeNode<Integer> xNode =  findNodeUsingValue(root, x);
        BinaryTree.TreeNode<Integer> yNode =  findNodeUsingValue(root, y);
        System.out.println(xNode.val+" "+yNode.val);

        int xLevel = nodeLevel(root, xNode);
        int yLevel = nodeLevel(root, yNode);
        System.out.println(xLevel+" "+yLevel);

        if (xLevel != yLevel){
            return false;
        }
        BinaryTree.TreeNode<Integer> xParent =  findParent(root,xNode);
        BinaryTree.TreeNode<Integer> yParent =  findParent(root,yNode);
        return xParent != yParent;

    }

//    public static BinarySearchTree.TreeNode<Integer> findNodeUsingValue(BinarySearchTree.TreeNode<Integer> root, int value){
//        if (root == null){
//            return null;
//        }
//
//        if (root.val == value){
//            return root;
//        }
//        BinarySearchTree.TreeNode<Integer> nodeFromLeft = findNodeUsingValue(root.left, value);
//        if (nodeFromLeft != null){
//            return nodeFromLeft;
//        }
//        BinarySearchTree.TreeNode<Integer> nodeFromRight = findNodeUsingValue(root.right, value);
//        return nodeFromRight;
//    }

    public static int nodeLevel(BinaryTree.TreeNode<Integer> root, BinaryTree.TreeNode<Integer> node) {

        if (root == null){
            return -1;
        }
        int level = 0;

        Queue<BinaryTree.TreeNode<Integer>> nodeOrderQueue = new LinkedList<>();
        nodeOrderQueue.offer(root);

        while (!nodeOrderQueue.isEmpty()){

            int levelSize = nodeOrderQueue.size();

            for (int i = 0; i < levelSize; i++) {
                BinaryTree.TreeNode<Integer> currNode = nodeOrderQueue.poll();
                if (currNode == node){
                    return level;
                }
                if (currNode.left != null){
                    nodeOrderQueue.offer(currNode.left);
                }
                if (currNode.right != null){
                    nodeOrderQueue.offer(currNode.right);
                }
            }
            level += 1;
        }
        return -1;
    }
    public static  BinaryTree.TreeNode<Integer> findParent(BinaryTree.TreeNode<Integer> root, BinaryTree.TreeNode<Integer> node){

            if (root == null){
                return null;
            }

            Queue<BinaryTree.TreeNode<Integer>> nodeOrderQueue = new LinkedList<>();
            nodeOrderQueue.offer(root);

            while (!nodeOrderQueue.isEmpty()){

                int levelSize = nodeOrderQueue.size();

                for (int i = 0; i < levelSize; i++) {
                    BinaryTree.TreeNode<Integer> currNode = nodeOrderQueue.poll();
                    if (currNode.left == node || currNode.right == node){
                        return currNode;
                    }
                    if (currNode.left != null){
                        nodeOrderQueue.offer(currNode.left);
                    }
                    if (currNode.right != null){
                        nodeOrderQueue.offer(currNode.right);
                    }
                }
            }
            return null;
        }
    }

