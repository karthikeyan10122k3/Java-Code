package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

import java.util.ArrayList;

public class TraversalDisplayDFS {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinarySearchTree.TreeNode<Integer> root = bst.insert(new Integer[]{3,8,9,20,15,7});

//        bst.displayTree();

        System.out.println("Pre-Order Traversal Display: ");
//        preOrderDisplay(root, "",true);
//        System.out.println();
        ArrayList<Integer> preOrderReturn = preOrderReturn(root,new ArrayList<>());
        System.out.println(preOrderReturn);

        System.out.println("In-Order Traversal Display: ");
//        inOrderDisplay(root,"",true);
//        System.out.println();
        ArrayList<Integer> inOrderReturn = inOrderReturn(root,new ArrayList<>());
        System.out.println(inOrderReturn);

//        System.out.println("Post-Order Traversal Display: ");
//        postOrderDisplay(root,"",true);
//        System.out.println();
        ArrayList<Integer> postOrderReturn = postOrderReturn(root,new ArrayList<>());
//        System.out.println(postOrderReturn);

    }

//  Pre-Order
    private static void preOrderDisplay(BinarySearchTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
        if (treeNode == null) {
            return;
        }

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
            indent += "     ";
        } else {
            System.out.print("L----");
            indent += "|    ";
        }

        System.out.println(treeNode.val);
        preOrderDisplay(treeNode.left, indent, false);
        preOrderDisplay(treeNode.right, indent, true);
    }
    public static ArrayList<Integer> preOrderReturn(BinarySearchTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }
        arr.add(treeNode.val);
        preOrderReturn(treeNode.left, arr);
        preOrderReturn(treeNode.right, arr);

        return arr;
    }

//  In-Order
    private static void inOrderDisplay(BinarySearchTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
        if (treeNode == null) {
            return;
        }

        inOrderDisplay(treeNode.left, indent + (isRight ? "     " : "|    "), false);

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
        } else {
            System.out.print("L----");
        }

        System.out.println(treeNode.val);

        inOrderDisplay(treeNode.right, indent + (isRight ? "     " : "|    "), true);
    }
    private static ArrayList<Integer> inOrderReturn(BinarySearchTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }

        inOrderReturn(treeNode.left, arr);
        arr.add(treeNode.val);
        inOrderReturn(treeNode.right, arr);

        return arr;
    }

//  Post-Order
    private static void postOrderDisplay(BinarySearchTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
        if (treeNode == null) {
            return;
        }

        postOrderDisplay(treeNode.left, indent + (isRight ? "     " : "|    "), false);
        postOrderDisplay(treeNode.right, indent + (isRight ? "     " : "|    "), true);

        System.out.print(indent);

        if (isRight) {
            System.out.print("R----");
        } else {
            System.out.print("L----");
        }

        System.out.println(treeNode.val);
    }

    public static ArrayList<Integer> postOrderReturn(BinarySearchTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }
        postOrderReturn(treeNode.left, arr);
        postOrderReturn(treeNode.right, arr);
        arr.add(treeNode.val);

        return arr;
    }


}
