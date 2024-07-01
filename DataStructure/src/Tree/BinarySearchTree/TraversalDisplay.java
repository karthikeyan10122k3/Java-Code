package com.kar.practice.exercise.DataStructure.src.Tree.BinarySearchTree;

import java.util.ArrayList;

public class TraversalDisplay {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        BinarySearchTree.TreeNode<Integer> root = bst.insert(new Integer[]{50,30,20,40,10,25,});

//        bst.displayTree();

//        System.out.println("Pre-Order Traversal Display: ");
//        preOrderDisplay(root, "",true);
//        System.out.println();
        ArrayList<Integer> preOrderReturn = preOrderReturn(root,new ArrayList<>());
        System.out.println(preOrderReturn);

//        System.out.println("In-Order Traversal Display: ");
//        inOrderDisplay(root,"",true);
//        System.out.println();
        ArrayList<Integer> inOrderReturn = inOrderReturn(root,new ArrayList<>());
        System.out.println(inOrderReturn);

//        System.out.println("Post-Order Traversal Display: ");
//        postOrderDisplay(root,"",true);
//        System.out.println();
        ArrayList<Integer> postOrderReturn = postOrderReturn(root,new ArrayList<>());
        System.out.println(postOrderReturn);

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

        System.out.println(treeNode.value);
        preOrderDisplay(treeNode.left, indent, false);
        preOrderDisplay(treeNode.right, indent, true);
    }
    public static ArrayList<Integer> preOrderReturn(BinarySearchTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }
        arr.add(treeNode.value);
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

        System.out.println(treeNode.value);

        inOrderDisplay(treeNode.right, indent + (isRight ? "     " : "|    "), true);
    }
    private static ArrayList<Integer> inOrderReturn(BinarySearchTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }

        inOrderReturn(treeNode.left, arr);
        arr.add(treeNode.value);
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

        System.out.println(treeNode.value);
    }

    public static ArrayList<Integer> postOrderReturn(BinarySearchTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }
        postOrderReturn(treeNode.left, arr);
        postOrderReturn(treeNode.right, arr);
        arr.add(treeNode.value);

        return arr;
    }


}
