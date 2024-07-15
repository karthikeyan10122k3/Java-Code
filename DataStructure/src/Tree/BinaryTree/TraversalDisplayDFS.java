package com.kar.practice.exercise.DataStructure.src.Tree.BinaryTree;

import java.util.ArrayList;

public class TraversalDisplayDFS {

    public static void main(String[] args) {
        BinaryTree<Integer> tree = new BinaryTree<>();
        Integer[] array = {3,9,20,8,10,15,7};
        tree.createBinaryTreeFromArray(array);
        tree.displayTree();

        System.out.println("Pre-Order Traversal Display: ");
//        preOrderDisplay(root, "",true);
//        System.out.println();
        ArrayList<Integer> preOrderReturn = preOrderReturn(tree.root,new ArrayList<>());
        System.out.println(preOrderReturn);

        System.out.println("In-Order Traversal Display: ");
//        inOrderDisplay(root,"",true);
//        System.out.println();
        ArrayList<Integer> inOrderReturn = inOrderReturn(tree.root,new ArrayList<>());
        System.out.println(inOrderReturn);

        System.out.println("Post-Order Traversal Display: ");
//        postOrderDisplay(root,"",true);
//        System.out.println();
        ArrayList<Integer> postOrderReturn = postOrderReturn(tree.root,new ArrayList<>());
        System.out.println(postOrderReturn);

    }

//  Pre-Order
    private static void preOrderDisplay(BinaryTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
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
    public static ArrayList<Integer> preOrderReturn(BinaryTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }
        arr.add(treeNode.val);
        preOrderReturn(treeNode.left, arr);
        preOrderReturn(treeNode.right, arr);

        return arr;
    }

//  In-Order
    private static void inOrderDisplay(BinaryTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
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
    private static ArrayList<Integer> inOrderReturn(BinaryTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }

        inOrderReturn(treeNode.left, arr);
        arr.add(treeNode.val);
        inOrderReturn(treeNode.right, arr);

        return arr;
    }

//  Post-Order
    private static void postOrderDisplay(BinaryTree.TreeNode<Integer> treeNode, String indent, boolean isRight) {
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

    public static ArrayList<Integer> postOrderReturn(BinaryTree.TreeNode<Integer> treeNode, ArrayList<Integer> arr){
        if (treeNode == null) {
            return arr;
        }
        postOrderReturn(treeNode.left, arr);
        postOrderReturn(treeNode.right, arr);
        arr.add(treeNode.val);

        return arr;
    }


}
